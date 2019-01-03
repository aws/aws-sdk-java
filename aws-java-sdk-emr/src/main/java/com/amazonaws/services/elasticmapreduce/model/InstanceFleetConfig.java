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
 * The configuration that defines an instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the instance fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
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
     * exceeded by 3 units.
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
     * units.
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
     * The instance type configurations that define the EC2 instances in the instance fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceTypeConfig> instanceTypeConfigs;
    /**
     * <p>
     * The launch specification for the instance fleet.
     * </p>
     */
    private InstanceFleetProvisioningSpecifications launchSpecifications;

    /**
     * <p>
     * The friendly name of the instance fleet.
     * </p>
     * 
     * @param name
     *        The friendly name of the instance fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the instance fleet.
     * </p>
     * 
     * @return The friendly name of the instance fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the instance fleet.
     * </p>
     * 
     * @param name
     *        The friendly name of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * </p>
     * 
     * @return The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * @see InstanceFleetType
     */

    public String getInstanceFleetType() {
        return this.instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public InstanceFleetConfig withInstanceFleetType(String instanceFleetType) {
        setInstanceFleetType(instanceFleetType);
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(InstanceFleetType instanceFleetType) {
        withInstanceFleetType(instanceFleetType);
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public InstanceFleetConfig withInstanceFleetType(InstanceFleetType instanceFleetType) {
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
     * exceeded by 3 units.
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
     *        by 3 units.</p> <note>
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
     * exceeded by 3 units.
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
     *         exceeded by 3 units.</p> <note>
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
     * exceeded by 3 units.
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
     *        by 3 units.</p> <note>
     *        <p>
     *        If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     *        <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     *        <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value
     *        must be 1.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
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
     * units.
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
     *        the target capacity is exceeded by 3 units.</p> <note>
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
     * units.
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
     *         provisioned, and the target capacity is exceeded by 3 units.</p> <note>
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
     * units.
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
     *        the target capacity is exceeded by 3 units.</p> <note>
     *        <p>
     *        If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least
     *        one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0.
     *        For a master instance fleet, only one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> can be specified, and its value must be 1.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withTargetSpotCapacity(Integer targetSpotCapacity) {
        setTargetSpotCapacity(targetSpotCapacity);
        return this;
    }

    /**
     * <p>
     * The instance type configurations that define the EC2 instances in the instance fleet.
     * </p>
     * 
     * @return The instance type configurations that define the EC2 instances in the instance fleet.
     */

    public java.util.List<InstanceTypeConfig> getInstanceTypeConfigs() {
        if (instanceTypeConfigs == null) {
            instanceTypeConfigs = new com.amazonaws.internal.SdkInternalList<InstanceTypeConfig>();
        }
        return instanceTypeConfigs;
    }

    /**
     * <p>
     * The instance type configurations that define the EC2 instances in the instance fleet.
     * </p>
     * 
     * @param instanceTypeConfigs
     *        The instance type configurations that define the EC2 instances in the instance fleet.
     */

    public void setInstanceTypeConfigs(java.util.Collection<InstanceTypeConfig> instanceTypeConfigs) {
        if (instanceTypeConfigs == null) {
            this.instanceTypeConfigs = null;
            return;
        }

        this.instanceTypeConfigs = new com.amazonaws.internal.SdkInternalList<InstanceTypeConfig>(instanceTypeConfigs);
    }

    /**
     * <p>
     * The instance type configurations that define the EC2 instances in the instance fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypeConfigs(java.util.Collection)} or {@link #withInstanceTypeConfigs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceTypeConfigs
     *        The instance type configurations that define the EC2 instances in the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withInstanceTypeConfigs(InstanceTypeConfig... instanceTypeConfigs) {
        if (this.instanceTypeConfigs == null) {
            setInstanceTypeConfigs(new com.amazonaws.internal.SdkInternalList<InstanceTypeConfig>(instanceTypeConfigs.length));
        }
        for (InstanceTypeConfig ele : instanceTypeConfigs) {
            this.instanceTypeConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance type configurations that define the EC2 instances in the instance fleet.
     * </p>
     * 
     * @param instanceTypeConfigs
     *        The instance type configurations that define the EC2 instances in the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withInstanceTypeConfigs(java.util.Collection<InstanceTypeConfig> instanceTypeConfigs) {
        setInstanceTypeConfigs(instanceTypeConfigs);
        return this;
    }

    /**
     * <p>
     * The launch specification for the instance fleet.
     * </p>
     * 
     * @param launchSpecifications
     *        The launch specification for the instance fleet.
     */

    public void setLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    /**
     * <p>
     * The launch specification for the instance fleet.
     * </p>
     * 
     * @return The launch specification for the instance fleet.
     */

    public InstanceFleetProvisioningSpecifications getLaunchSpecifications() {
        return this.launchSpecifications;
    }

    /**
     * <p>
     * The launch specification for the instance fleet.
     * </p>
     * 
     * @param launchSpecifications
     *        The launch specification for the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetConfig withLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceFleetType() != null)
            sb.append("InstanceFleetType: ").append(getInstanceFleetType()).append(",");
        if (getTargetOnDemandCapacity() != null)
            sb.append("TargetOnDemandCapacity: ").append(getTargetOnDemandCapacity()).append(",");
        if (getTargetSpotCapacity() != null)
            sb.append("TargetSpotCapacity: ").append(getTargetSpotCapacity()).append(",");
        if (getInstanceTypeConfigs() != null)
            sb.append("InstanceTypeConfigs: ").append(getInstanceTypeConfigs()).append(",");
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

        if (obj instanceof InstanceFleetConfig == false)
            return false;
        InstanceFleetConfig other = (InstanceFleetConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getInstanceTypeConfigs() == null ^ this.getInstanceTypeConfigs() == null)
            return false;
        if (other.getInstanceTypeConfigs() != null && other.getInstanceTypeConfigs().equals(this.getInstanceTypeConfigs()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetType() == null) ? 0 : getInstanceFleetType().hashCode());
        hashCode = prime * hashCode + ((getTargetOnDemandCapacity() == null) ? 0 : getTargetOnDemandCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetSpotCapacity() == null) ? 0 : getTargetSpotCapacity().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypeConfigs() == null) ? 0 : getInstanceTypeConfigs().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetConfig clone() {
        try {
            return (InstanceFleetConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
