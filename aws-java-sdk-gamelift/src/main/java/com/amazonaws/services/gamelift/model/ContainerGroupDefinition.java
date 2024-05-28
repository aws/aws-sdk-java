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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * The properties that describe a container group resource. Container group definition properties can't be updated. To
 * change a property, create a new container group definition.
 * </p>
 * <p>
 * <b>Used with:</b> <a>CreateContainerGroupDefinition</a>
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeContainerGroupDefinition</a>, <a>ListContainerGroupDefinitions</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerGroupDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerGroupDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the
     * resource across all Amazon Web Services Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     * </p>
     */
    private String containerGroupDefinitionArn;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The platform required for all containers in the container group definition.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value is unique in an Amazon Web Services
     * Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet instance.
     * </p>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in the
     * group share these resources.
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Equal to or greater than any container-specific hard limits in the group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     */
    private Integer totalMemoryLimit;
    /**
     * <p>
     * The amount of CPU units on a fleet instance to allocate for the container group. All containers in the group
     * share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU units).
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must be equal to or greater than the sum of all container-specific CPU limits in the group.
     * </p>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     */
    private Integer totalCpuLimit;
    /**
     * <p>
     * The set of container definitions that are included in the container group.
     * </p>
     */
    private java.util.List<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * Current status of the container group definition resource. Values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that are
     * defined in the group. While in this state, the resource can't be used to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined in the
     * group. You can use a container group definition in this status to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For more
     * details on the cause of the failure, see <code>StatusReason</code>. A container group definition resource in
     * failed status will be deleted within a few minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Additional information about a container group definition that's in <code>FAILED</code> status. Possible reasons
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete the
     * failed resource and call <a>CreateContainerGroupDefinition</a>again.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access-denied message means that you don't have permissions to access the container image on ECR. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>ImageUri</code> value for at least one of the containers in the container group definition was invalid
     * or not found in the current Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition exceeds the allowed size. For
     * size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon GameLift endpoints
     * and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition uses a different operating
     * system than the one defined for the container group.
     * </p>
     * </li>
     * </ul>
     */
    private String statusReason;

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the
     * resource across all Amazon Web Services Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     * </p>
     * 
     * @param containerGroupDefinitionArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *        Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the resource across
     *        all Amazon Web Services Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     */

    public void setContainerGroupDefinitionArn(String containerGroupDefinitionArn) {
        this.containerGroupDefinitionArn = containerGroupDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the
     * resource across all Amazon Web Services Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *         Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the resource
     *         across all Amazon Web Services Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     */

    public String getContainerGroupDefinitionArn() {
        return this.containerGroupDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the
     * resource across all Amazon Web Services Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     * </p>
     * 
     * @param containerGroupDefinitionArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *        Amazon GameLift <code>ContainerGroupDefinition</code> resource. It uniquely identifies the resource across
     *        all Amazon Web Services Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container group definition name]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withContainerGroupDefinitionArn(String containerGroupDefinitionArn) {
        setContainerGroupDefinitionArn(containerGroupDefinitionArn);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The platform required for all containers in the container group definition.
     * </p>
     * 
     * @param operatingSystem
     *        The platform required for all containers in the container group definition.
     * @see ContainerOperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The platform required for all containers in the container group definition.
     * </p>
     * 
     * @return The platform required for all containers in the container group definition.
     * @see ContainerOperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The platform required for all containers in the container group definition.
     * </p>
     * 
     * @param operatingSystem
     *        The platform required for all containers in the container group definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerOperatingSystem
     */

    public ContainerGroupDefinition withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The platform required for all containers in the container group definition.
     * </p>
     * 
     * @param operatingSystem
     *        The platform required for all containers in the container group definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerOperatingSystem
     */

    public ContainerGroupDefinition withOperatingSystem(ContainerOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value is unique in an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param name
     *        A descriptive identifier for the container group definition. The name value is unique in an Amazon Web
     *        Services Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value is unique in an Amazon Web Services
     * Region.
     * </p>
     * 
     * @return A descriptive identifier for the container group definition. The name value is unique in an Amazon Web
     *         Services Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value is unique in an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param name
     *        A descriptive identifier for the container group definition. The name value is unique in an Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet instance.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet
     *        instance.
     * @see ContainerSchedulingStrategy
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet instance.
     * </p>
     * 
     * @return The method for deploying the container group across fleet instances. A replica container group might have
     *         multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet
     *         instance.
     * @see ContainerSchedulingStrategy
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet instance.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ContainerGroupDefinition withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet instance.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group maintains only one copy per fleet
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ContainerGroupDefinition withSchedulingStrategy(ContainerSchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in the
     * group share these resources.
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Equal to or greater than any container-specific hard limits in the group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @param totalMemoryLimit
     *        The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in
     *        the group share these resources. </p>
     *        <p>
     *        You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *        have limits, this value must meet the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Equal to or greater than the sum of all container-specific soft memory limits in the group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Equal to or greater than any container-specific hard limits in the group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more details on memory allocation, see the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *        design guide</a>.
     */

    public void setTotalMemoryLimit(Integer totalMemoryLimit) {
        this.totalMemoryLimit = totalMemoryLimit;
    }

    /**
     * <p>
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in the
     * group share these resources.
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Equal to or greater than any container-specific hard limits in the group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @return The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in
     *         the group share these resources. </p>
     *         <p>
     *         You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *         have limits, this value must meet the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Equal to or greater than the sum of all container-specific soft memory limits in the group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Equal to or greater than any container-specific hard limits in the group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more details on memory allocation, see the <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *         design guide</a>.
     */

    public Integer getTotalMemoryLimit() {
        return this.totalMemoryLimit;
    }

    /**
     * <p>
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in the
     * group share these resources.
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Equal to or greater than any container-specific hard limits in the group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @param totalMemoryLimit
     *        The amount of memory (in MiB) on a fleet instance to allocate for the container group. All containers in
     *        the group share these resources. </p>
     *        <p>
     *        You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *        have limits, this value must meet the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Equal to or greater than the sum of all container-specific soft memory limits in the group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Equal to or greater than any container-specific hard limits in the group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more details on memory allocation, see the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *        design guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withTotalMemoryLimit(Integer totalMemoryLimit) {
        setTotalMemoryLimit(totalMemoryLimit);
        return this;
    }

    /**
     * <p>
     * The amount of CPU units on a fleet instance to allocate for the container group. All containers in the group
     * share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU units).
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must be equal to or greater than the sum of all container-specific CPU limits in the group.
     * </p>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @param totalCpuLimit
     *        The amount of CPU units on a fleet instance to allocate for the container group. All containers in the
     *        group share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU
     *        units). </p>
     *        <p>
     *        You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *        have limits, this value must be equal to or greater than the sum of all container-specific CPU limits in
     *        the group.
     *        </p>
     *        <p>
     *        For more details on memory allocation, see the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *        design guide</a>.
     */

    public void setTotalCpuLimit(Integer totalCpuLimit) {
        this.totalCpuLimit = totalCpuLimit;
    }

    /**
     * <p>
     * The amount of CPU units on a fleet instance to allocate for the container group. All containers in the group
     * share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU units).
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must be equal to or greater than the sum of all container-specific CPU limits in the group.
     * </p>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @return The amount of CPU units on a fleet instance to allocate for the container group. All containers in the
     *         group share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU
     *         units). </p>
     *         <p>
     *         You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *         have limits, this value must be equal to or greater than the sum of all container-specific CPU limits in
     *         the group.
     *         </p>
     *         <p>
     *         For more details on memory allocation, see the <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *         design guide</a>.
     */

    public Integer getTotalCpuLimit() {
        return this.totalCpuLimit;
    }

    /**
     * <p>
     * The amount of CPU units on a fleet instance to allocate for the container group. All containers in the group
     * share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU units).
     * </p>
     * <p>
     * You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers have
     * limits, this value must be equal to or greater than the sum of all container-specific CPU limits in the group.
     * </p>
     * <p>
     * For more details on memory allocation, see the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet design
     * guide</a>.
     * </p>
     * 
     * @param totalCpuLimit
     *        The amount of CPU units on a fleet instance to allocate for the container group. All containers in the
     *        group share these resources. This property is an integer value in CPU units (1 vCPU is equal to 1024 CPU
     *        units). </p>
     *        <p>
     *        You can set additional limits for each <a>ContainerDefinition</a> in the group. If individual containers
     *        have limits, this value must be equal to or greater than the sum of all container-specific CPU limits in
     *        the group.
     *        </p>
     *        <p>
     *        For more details on memory allocation, see the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet">Container fleet
     *        design guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withTotalCpuLimit(Integer totalCpuLimit) {
        setTotalCpuLimit(totalCpuLimit);
        return this;
    }

    /**
     * <p>
     * The set of container definitions that are included in the container group.
     * </p>
     * 
     * @return The set of container definitions that are included in the container group.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * <p>
     * The set of container definitions that are included in the container group.
     * </p>
     * 
     * @param containerDefinitions
     *        The set of container definitions that are included in the container group.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new java.util.ArrayList<ContainerDefinition>(containerDefinitions);
    }

    /**
     * <p>
     * The set of container definitions that are included in the container group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        The set of container definitions that are included in the container group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new java.util.ArrayList<ContainerDefinition>(containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of container definitions that are included in the container group.
     * </p>
     * 
     * @param containerDefinitions
     *        The set of container definitions that are included in the container group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * Current status of the container group definition resource. Values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that are
     * defined in the group. While in this state, the resource can't be used to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined in the
     * group. You can use a container group definition in this status to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For more
     * details on the cause of the failure, see <code>StatusReason</code>. A container group definition resource in
     * failed status will be deleted within a few minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the container group definition resource. Values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that
     *        are defined in the group. While in this state, the resource can't be used to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined
     *        in the group. You can use a container group definition in this status to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For
     *        more details on the cause of the failure, see <code>StatusReason</code>. A container group definition
     *        resource in failed status will be deleted within a few minutes.
     *        </p>
     *        </li>
     * @see ContainerGroupDefinitionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the container group definition resource. Values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that are
     * defined in the group. While in this state, the resource can't be used to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined in the
     * group. You can use a container group definition in this status to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For more
     * details on the cause of the failure, see <code>StatusReason</code>. A container group definition resource in
     * failed status will be deleted within a few minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the container group definition resource. Values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that
     *         are defined in the group. While in this state, the resource can't be used to create a container fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined
     *         in the group. You can use a container group definition in this status to create a container fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For
     *         more details on the cause of the failure, see <code>StatusReason</code>. A container group definition
     *         resource in failed status will be deleted within a few minutes.
     *         </p>
     *         </li>
     * @see ContainerGroupDefinitionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the container group definition resource. Values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that are
     * defined in the group. While in this state, the resource can't be used to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined in the
     * group. You can use a container group definition in this status to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For more
     * details on the cause of the failure, see <code>StatusReason</code>. A container group definition resource in
     * failed status will be deleted within a few minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the container group definition resource. Values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that
     *        are defined in the group. While in this state, the resource can't be used to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined
     *        in the group. You can use a container group definition in this status to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For
     *        more details on the cause of the failure, see <code>StatusReason</code>. A container group definition
     *        resource in failed status will be deleted within a few minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerGroupDefinitionStatus
     */

    public ContainerGroupDefinition withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the container group definition resource. Values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that are
     * defined in the group. While in this state, the resource can't be used to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined in the
     * group. You can use a container group definition in this status to create a container fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For more
     * details on the cause of the failure, see <code>StatusReason</code>. A container group definition resource in
     * failed status will be deleted within a few minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the container group definition resource. Values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COPYING</code> -- Amazon GameLift is in the process of making copies of all container images that
     *        are defined in the group. While in this state, the resource can't be used to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> -- Amazon GameLift has copied the registry images for all containers that are defined
     *        in the group. You can use a container group definition in this status to create a container fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> -- Amazon GameLift failed to create a valid container group definition resource. For
     *        more details on the cause of the failure, see <code>StatusReason</code>. A container group definition
     *        resource in failed status will be deleted within a few minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerGroupDefinitionStatus
     */

    public ContainerGroupDefinition withStatus(ContainerGroupDefinitionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about a container group definition that's in <code>FAILED</code> status. Possible reasons
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete the
     * failed resource and call <a>CreateContainerGroupDefinition</a>again.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access-denied message means that you don't have permissions to access the container image on ECR. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>ImageUri</code> value for at least one of the containers in the container group definition was invalid
     * or not found in the current Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition exceeds the allowed size. For
     * size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon GameLift endpoints
     * and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition uses a different operating
     * system than the one defined for the container group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusReason
     *        Additional information about a container group definition that's in <code>FAILED</code> status. Possible
     *        reasons include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete
     *        the failed resource and call <a>CreateContainerGroupDefinition</a>again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access-denied message means that you don't have permissions to access the container image on ECR. See
     *        <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">
     *        IAM permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>ImageUri</code> value for at least one of the containers in the container group definition was
     *        invalid or not found in the current Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        At least one of the container images referenced in the container group definition exceeds the allowed
     *        size. For size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon
     *        GameLift endpoints and quotas</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        At least one of the container images referenced in the container group definition uses a different
     *        operating system than the one defined for the container group.
     *        </p>
     *        </li>
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional information about a container group definition that's in <code>FAILED</code> status. Possible reasons
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete the
     * failed resource and call <a>CreateContainerGroupDefinition</a>again.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access-denied message means that you don't have permissions to access the container image on ECR. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>ImageUri</code> value for at least one of the containers in the container group definition was invalid
     * or not found in the current Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition exceeds the allowed size. For
     * size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon GameLift endpoints
     * and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition uses a different operating
     * system than the one defined for the container group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional information about a container group definition that's in <code>FAILED</code> status. Possible
     *         reasons include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete
     *         the failed resource and call <a>CreateContainerGroupDefinition</a>again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access-denied message means that you don't have permissions to access the container image on ECR. See
     *         <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">
     *         IAM permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>ImageUri</code> value for at least one of the containers in the container group definition was
     *         invalid or not found in the current Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         At least one of the container images referenced in the container group definition exceeds the allowed
     *         size. For size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon
     *         GameLift endpoints and quotas</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         At least one of the container images referenced in the container group definition uses a different
     *         operating system than the one defined for the container group.
     *         </p>
     *         </li>
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional information about a container group definition that's in <code>FAILED</code> status. Possible reasons
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete the
     * failed resource and call <a>CreateContainerGroupDefinition</a>again.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access-denied message means that you don't have permissions to access the container image on ECR. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>ImageUri</code> value for at least one of the containers in the container group definition was invalid
     * or not found in the current Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition exceeds the allowed size. For
     * size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon GameLift endpoints
     * and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * At least one of the container images referenced in the container group definition uses a different operating
     * system than the one defined for the container group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusReason
     *        Additional information about a container group definition that's in <code>FAILED</code> status. Possible
     *        reasons include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An internal issue prevented Amazon GameLift from creating the container group definition resource. Delete
     *        the failed resource and call <a>CreateContainerGroupDefinition</a>again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access-denied message means that you don't have permissions to access the container image on ECR. See
     *        <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">
     *        IAM permission examples</a> for help setting up required IAM permissions for Amazon GameLift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>ImageUri</code> value for at least one of the containers in the container group definition was
     *        invalid or not found in the current Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        At least one of the container images referenced in the container group definition exceeds the allowed
     *        size. For size limits, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html"> Amazon
     *        GameLift endpoints and quotas</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        At least one of the container images referenced in the container group definition uses a different
     *        operating system than the one defined for the container group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinition withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getContainerGroupDefinitionArn() != null)
            sb.append("ContainerGroupDefinitionArn: ").append(getContainerGroupDefinitionArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getTotalMemoryLimit() != null)
            sb.append("TotalMemoryLimit: ").append(getTotalMemoryLimit()).append(",");
        if (getTotalCpuLimit() != null)
            sb.append("TotalCpuLimit: ").append(getTotalCpuLimit()).append(",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerGroupDefinition == false)
            return false;
        ContainerGroupDefinition other = (ContainerGroupDefinition) obj;
        if (other.getContainerGroupDefinitionArn() == null ^ this.getContainerGroupDefinitionArn() == null)
            return false;
        if (other.getContainerGroupDefinitionArn() != null && other.getContainerGroupDefinitionArn().equals(this.getContainerGroupDefinitionArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getTotalMemoryLimit() == null ^ this.getTotalMemoryLimit() == null)
            return false;
        if (other.getTotalMemoryLimit() != null && other.getTotalMemoryLimit().equals(this.getTotalMemoryLimit()) == false)
            return false;
        if (other.getTotalCpuLimit() == null ^ this.getTotalCpuLimit() == null)
            return false;
        if (other.getTotalCpuLimit() != null && other.getTotalCpuLimit().equals(this.getTotalCpuLimit()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerGroupDefinitionArn() == null) ? 0 : getContainerGroupDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getTotalMemoryLimit() == null) ? 0 : getTotalMemoryLimit().hashCode());
        hashCode = prime * hashCode + ((getTotalCpuLimit() == null) ? 0 : getTotalCpuLimit().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public ContainerGroupDefinition clone() {
        try {
            return (ContainerGroupDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerGroupDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
