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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon Lightsail container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container service.
     * </p>
     */
    private String containerServiceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp when the container service was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An object that describes the location of the container service, such as the AWS Region and Availability Zone.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The power specification of the container service.
     * </p>
     * <p>
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * </p>
     */
    private String power;
    /**
     * <p>
     * The ID of the power of the container service.
     * </p>
     */
    private String powerId;
    /**
     * <p>
     * The current state of the container service.
     * </p>
     * <p>
     * The following container service states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The container service is running but it does not have an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYING</code> - The container service is launching a container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The container service is running and it has an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The container service is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if any, are
     * shut down.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * An object that describes the current state of the container service.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     */
    private ContainerServiceStateDetail stateDetail;
    /**
     * <p>
     * The scale specification of the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service.
     * </p>
     */
    private Integer scale;
    /**
     * <p>
     * An object that describes the current container deployment of the container service.
     * </p>
     */
    private ContainerServiceDeployment currentDeployment;
    /**
     * <p>
     * An object that describes the next deployment of the container service.
     * </p>
     * <p>
     * This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     * </p>
     */
    private ContainerServiceDeployment nextDeployment;
    /**
     * <p>
     * A Boolean value indicating whether the container service is disabled.
     * </p>
     */
    private Boolean isDisabled;
    /**
     * <p>
     * The principal ARN of the container service.
     * </p>
     * <p>
     * The principal ARN can be used to create a trust relationship between your standard AWS account and your Lightsail
     * container service. This allows you to give your service permission to access resources in your standard AWS
     * account.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The private domain name of the container service.
     * </p>
     * <p>
     * The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of
     * your Lightsail account.
     * </p>
     */
    private String privateDomainName;
    /**
     * <p>
     * The public domain name of the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how to
     * specify public domain names for your Lightsail container service.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> publicDomainNames;
    /**
     * <p>
     * The publicly accessible URL of the container service.
     * </p>
     * <p>
     * If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of the container service.
     * </p>
     * 
     * @param containerServiceName
     *        The name of the container service.
     */

    public void setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
    }

    /**
     * <p>
     * The name of the container service.
     * </p>
     * 
     * @return The name of the container service.
     */

    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    /**
     * <p>
     * The name of the container service.
     * </p>
     * 
     * @param containerServiceName
     *        The name of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withContainerServiceName(String containerServiceName) {
        setContainerServiceName(containerServiceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the container service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp when the container service was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the container service was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the container service was created.
     * </p>
     * 
     * @return The timestamp when the container service was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the container service was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the container service was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An object that describes the location of the container service, such as the AWS Region and Availability Zone.
     * </p>
     * 
     * @param location
     *        An object that describes the location of the container service, such as the AWS Region and Availability
     *        Zone.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * An object that describes the location of the container service, such as the AWS Region and Availability Zone.
     * </p>
     * 
     * @return An object that describes the location of the container service, such as the AWS Region and Availability
     *         Zone.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * An object that describes the location of the container service, such as the AWS Region and Availability Zone.
     * </p>
     * 
     * @param location
     *        An object that describes the location of the container service, such as the AWS Region and Availability
     *        Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * </p>
     * 
     * @return The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ContainerService withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the container service (i.e., <code>ContainerService</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ContainerService withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *         Developer Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
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
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withTags(Tag... tags) {
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
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The power specification of the container service.
     * </p>
     * <p>
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param power
     *        The power specification of the container service.</p>
     *        <p>
     *        The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * @see ContainerServicePowerName
     */

    public void setPower(String power) {
        this.power = power;
    }

    /**
     * <p>
     * The power specification of the container service.
     * </p>
     * <p>
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @return The power specification of the container service.</p>
     *         <p>
     *         The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * @see ContainerServicePowerName
     */

    public String getPower() {
        return this.power;
    }

    /**
     * <p>
     * The power specification of the container service.
     * </p>
     * <p>
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param power
     *        The power specification of the container service.</p>
     *        <p>
     *        The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public ContainerService withPower(String power) {
        setPower(power);
        return this;
    }

    /**
     * <p>
     * The power specification of the container service.
     * </p>
     * <p>
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param power
     *        The power specification of the container service.</p>
     *        <p>
     *        The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public ContainerService withPower(ContainerServicePowerName power) {
        this.power = power.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the power of the container service.
     * </p>
     * 
     * @param powerId
     *        The ID of the power of the container service.
     */

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }

    /**
     * <p>
     * The ID of the power of the container service.
     * </p>
     * 
     * @return The ID of the power of the container service.
     */

    public String getPowerId() {
        return this.powerId;
    }

    /**
     * <p>
     * The ID of the power of the container service.
     * </p>
     * 
     * @param powerId
     *        The ID of the power of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withPowerId(String powerId) {
        setPowerId(powerId);
        return this;
    }

    /**
     * <p>
     * The current state of the container service.
     * </p>
     * <p>
     * The following container service states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The container service is running but it does not have an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYING</code> - The container service is launching a container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The container service is running and it has an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The container service is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if any, are
     * shut down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the container service.</p>
     *        <p>
     *        The following container service states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The container service is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The container service is running but it does not have an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYING</code> - The container service is launching a container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The container service is running and it has an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The container service is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if
     *        any, are shut down.
     *        </p>
     *        </li>
     * @see ContainerServiceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the container service.
     * </p>
     * <p>
     * The following container service states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The container service is running but it does not have an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYING</code> - The container service is launching a container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The container service is running and it has an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The container service is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if any, are
     * shut down.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the container service.</p>
     *         <p>
     *         The following container service states are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The container service is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> - The container service is running but it does not have an active container
     *         deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPLOYING</code> - The container service is launching a container deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> - The container service is running and it has an active container deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The container service is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if
     *         any, are shut down.
     *         </p>
     *         </li>
     * @see ContainerServiceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the container service.
     * </p>
     * <p>
     * The following container service states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The container service is running but it does not have an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYING</code> - The container service is launching a container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The container service is running and it has an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The container service is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if any, are
     * shut down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the container service.</p>
     *        <p>
     *        The following container service states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The container service is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The container service is running but it does not have an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYING</code> - The container service is launching a container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The container service is running and it has an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The container service is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if
     *        any, are shut down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceState
     */

    public ContainerService withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the container service.
     * </p>
     * <p>
     * The following container service states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The container service is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The container service is running but it does not have an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYING</code> - The container service is launching a container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The container service is running and it has an active container deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The container service is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if any, are
     * shut down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the container service.</p>
     *        <p>
     *        The following container service states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The container service is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The container service is running but it does not have an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYING</code> - The container service is launching a container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The container service is running and it has an active container deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The container service capacity or its custom domains are being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The container service is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The container service is disabled, and its active deployment and containers, if
     *        any, are shut down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceState
     */

    public ContainerService withState(ContainerServiceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the current state of the container service.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @param stateDetail
     *        An object that describes the current state of the container service.</p> <note>
     *        <p>
     *        The state detail is populated only when a container service is in a <code>PENDING</code>,
     *        <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *        </p>
     */

    public void setStateDetail(ContainerServiceStateDetail stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * <p>
     * An object that describes the current state of the container service.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @return An object that describes the current state of the container service.</p> <note>
     *         <p>
     *         The state detail is populated only when a container service is in a <code>PENDING</code>,
     *         <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *         </p>
     */

    public ContainerServiceStateDetail getStateDetail() {
        return this.stateDetail;
    }

    /**
     * <p>
     * An object that describes the current state of the container service.
     * </p>
     * <note>
     * <p>
     * The state detail is populated only when a container service is in a <code>PENDING</code>, <code>DEPLOYING</code>,
     * or <code>UPDATING</code> state.
     * </p>
     * </note>
     * 
     * @param stateDetail
     *        An object that describes the current state of the container service.</p> <note>
     *        <p>
     *        The state detail is populated only when a container service is in a <code>PENDING</code>,
     *        <code>DEPLOYING</code>, or <code>UPDATING</code> state.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withStateDetail(ContainerServiceStateDetail stateDetail) {
        setStateDetail(stateDetail);
        return this;
    }

    /**
     * <p>
     * The scale specification of the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service.
     * </p>
     * 
     * @param scale
     *        The scale specification of the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale specification of the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service.
     * </p>
     * 
     * @return The scale specification of the container service.</p>
     *         <p>
     *         The scale specifies the allocated compute nodes of the container service.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale specification of the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service.
     * </p>
     * 
     * @param scale
     *        The scale specification of the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * An object that describes the current container deployment of the container service.
     * </p>
     * 
     * @param currentDeployment
     *        An object that describes the current container deployment of the container service.
     */

    public void setCurrentDeployment(ContainerServiceDeployment currentDeployment) {
        this.currentDeployment = currentDeployment;
    }

    /**
     * <p>
     * An object that describes the current container deployment of the container service.
     * </p>
     * 
     * @return An object that describes the current container deployment of the container service.
     */

    public ContainerServiceDeployment getCurrentDeployment() {
        return this.currentDeployment;
    }

    /**
     * <p>
     * An object that describes the current container deployment of the container service.
     * </p>
     * 
     * @param currentDeployment
     *        An object that describes the current container deployment of the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withCurrentDeployment(ContainerServiceDeployment currentDeployment) {
        setCurrentDeployment(currentDeployment);
        return this;
    }

    /**
     * <p>
     * An object that describes the next deployment of the container service.
     * </p>
     * <p>
     * This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     * </p>
     * 
     * @param nextDeployment
     *        An object that describes the next deployment of the container service.</p>
     *        <p>
     *        This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     */

    public void setNextDeployment(ContainerServiceDeployment nextDeployment) {
        this.nextDeployment = nextDeployment;
    }

    /**
     * <p>
     * An object that describes the next deployment of the container service.
     * </p>
     * <p>
     * This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     * </p>
     * 
     * @return An object that describes the next deployment of the container service.</p>
     *         <p>
     *         This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     */

    public ContainerServiceDeployment getNextDeployment() {
        return this.nextDeployment;
    }

    /**
     * <p>
     * An object that describes the next deployment of the container service.
     * </p>
     * <p>
     * This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     * </p>
     * 
     * @param nextDeployment
     *        An object that describes the next deployment of the container service.</p>
     *        <p>
     *        This value is <code>null</code> when there is no deployment in a <code>pending</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withNextDeployment(ContainerServiceDeployment nextDeployment) {
        setNextDeployment(nextDeployment);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the container service is disabled.
     * </p>
     * 
     * @param isDisabled
     *        A Boolean value indicating whether the container service is disabled.
     */

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether the container service is disabled.
     * </p>
     * 
     * @return A Boolean value indicating whether the container service is disabled.
     */

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether the container service is disabled.
     * </p>
     * 
     * @param isDisabled
     *        A Boolean value indicating whether the container service is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withIsDisabled(Boolean isDisabled) {
        setIsDisabled(isDisabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the container service is disabled.
     * </p>
     * 
     * @return A Boolean value indicating whether the container service is disabled.
     */

    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * <p>
     * The principal ARN of the container service.
     * </p>
     * <p>
     * The principal ARN can be used to create a trust relationship between your standard AWS account and your Lightsail
     * container service. This allows you to give your service permission to access resources in your standard AWS
     * account.
     * </p>
     * 
     * @param principalArn
     *        The principal ARN of the container service.</p>
     *        <p>
     *        The principal ARN can be used to create a trust relationship between your standard AWS account and your
     *        Lightsail container service. This allows you to give your service permission to access resources in your
     *        standard AWS account.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The principal ARN of the container service.
     * </p>
     * <p>
     * The principal ARN can be used to create a trust relationship between your standard AWS account and your Lightsail
     * container service. This allows you to give your service permission to access resources in your standard AWS
     * account.
     * </p>
     * 
     * @return The principal ARN of the container service.</p>
     *         <p>
     *         The principal ARN can be used to create a trust relationship between your standard AWS account and your
     *         Lightsail container service. This allows you to give your service permission to access resources in your
     *         standard AWS account.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The principal ARN of the container service.
     * </p>
     * <p>
     * The principal ARN can be used to create a trust relationship between your standard AWS account and your Lightsail
     * container service. This allows you to give your service permission to access resources in your standard AWS
     * account.
     * </p>
     * 
     * @param principalArn
     *        The principal ARN of the container service.</p>
     *        <p>
     *        The principal ARN can be used to create a trust relationship between your standard AWS account and your
     *        Lightsail container service. This allows you to give your service permission to access resources in your
     *        standard AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The private domain name of the container service.
     * </p>
     * <p>
     * The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of
     * your Lightsail account.
     * </p>
     * 
     * @param privateDomainName
     *        The private domain name of the container service.</p>
     *        <p>
     *        The private domain name is accessible only by other resources within the default virtual private cloud
     *        (VPC) of your Lightsail account.
     */

    public void setPrivateDomainName(String privateDomainName) {
        this.privateDomainName = privateDomainName;
    }

    /**
     * <p>
     * The private domain name of the container service.
     * </p>
     * <p>
     * The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of
     * your Lightsail account.
     * </p>
     * 
     * @return The private domain name of the container service.</p>
     *         <p>
     *         The private domain name is accessible only by other resources within the default virtual private cloud
     *         (VPC) of your Lightsail account.
     */

    public String getPrivateDomainName() {
        return this.privateDomainName;
    }

    /**
     * <p>
     * The private domain name of the container service.
     * </p>
     * <p>
     * The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of
     * your Lightsail account.
     * </p>
     * 
     * @param privateDomainName
     *        The private domain name of the container service.</p>
     *        <p>
     *        The private domain name is accessible only by other resources within the default virtual private cloud
     *        (VPC) of your Lightsail account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withPrivateDomainName(String privateDomainName) {
        setPrivateDomainName(privateDomainName);
        return this;
    }

    /**
     * <p>
     * The public domain name of the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how to
     * specify public domain names for your Lightsail container service.
     * </p>
     * 
     * @return The public domain name of the container service, such as <code>example.com</code> and
     *         <code>www.example.com</code>.</p>
     *         <p>
     *         You can specify up to four public domain names for a container service. The domain names that you specify
     *         are used when you create a deployment with a container configured as the public endpoint of your
     *         container service.
     *         </p>
     *         <p>
     *         If you don't specify public domain names, then you can use the default domain of the container service.
     *         </p>
     *         <important>
     *         <p>
     *         You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *         container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *         domain names you want to use with your container service.
     *         </p>
     *         </important>
     *         <p>
     *         See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how
     *         to specify public domain names for your Lightsail container service.
     */

    public java.util.Map<String, java.util.List<String>> getPublicDomainNames() {
        return publicDomainNames;
    }

    /**
     * <p>
     * The public domain name of the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how to
     * specify public domain names for your Lightsail container service.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain name of the container service, such as <code>example.com</code> and
     *        <code>www.example.com</code>.</p>
     *        <p>
     *        You can specify up to four public domain names for a container service. The domain names that you specify
     *        are used when you create a deployment with a container configured as the public endpoint of your container
     *        service.
     *        </p>
     *        <p>
     *        If you don't specify public domain names, then you can use the default domain of the container service.
     *        </p>
     *        <important>
     *        <p>
     *        You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *        container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *        domain names you want to use with your container service.
     *        </p>
     *        </important>
     *        <p>
     *        See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how
     *        to specify public domain names for your Lightsail container service.
     */

    public void setPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        this.publicDomainNames = publicDomainNames;
    }

    /**
     * <p>
     * The public domain name of the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how to
     * specify public domain names for your Lightsail container service.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain name of the container service, such as <code>example.com</code> and
     *        <code>www.example.com</code>.</p>
     *        <p>
     *        You can specify up to four public domain names for a container service. The domain names that you specify
     *        are used when you create a deployment with a container configured as the public endpoint of your container
     *        service.
     *        </p>
     *        <p>
     *        If you don't specify public domain names, then you can use the default domain of the container service.
     *        </p>
     *        <important>
     *        <p>
     *        You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *        container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *        domain names you want to use with your container service.
     *        </p>
     *        </important>
     *        <p>
     *        See <code>CreateContainerService</code> or <code>UpdateContainerService</code> for information about how
     *        to specify public domain names for your Lightsail container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        setPublicDomainNames(publicDomainNames);
        return this;
    }

    /**
     * Add a single PublicDomainNames entry
     *
     * @see ContainerService#withPublicDomainNames
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService addPublicDomainNamesEntry(String key, java.util.List<String> value) {
        if (null == this.publicDomainNames) {
            this.publicDomainNames = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.publicDomainNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.publicDomainNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PublicDomainNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService clearPublicDomainNamesEntries() {
        this.publicDomainNames = null;
        return this;
    }

    /**
     * <p>
     * The publicly accessible URL of the container service.
     * </p>
     * <p>
     * If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     * </p>
     * 
     * @param url
     *        The publicly accessible URL of the container service.</p>
     *        <p>
     *        If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The publicly accessible URL of the container service.
     * </p>
     * <p>
     * If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     * </p>
     * 
     * @return The publicly accessible URL of the container service.</p>
     *         <p>
     *         If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404
     *         response.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The publicly accessible URL of the container service.
     * </p>
     * <p>
     * If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     * </p>
     * 
     * @param url
     *        The publicly accessible URL of the container service.</p>
     *        <p>
     *        If no public endpoint is specified in the <code>currentDeployment</code>, this URL returns a 404 response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerService withUrl(String url) {
        setUrl(url);
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
        if (getContainerServiceName() != null)
            sb.append("ContainerServiceName: ").append(getContainerServiceName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPower() != null)
            sb.append("Power: ").append(getPower()).append(",");
        if (getPowerId() != null)
            sb.append("PowerId: ").append(getPowerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateDetail() != null)
            sb.append("StateDetail: ").append(getStateDetail()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getCurrentDeployment() != null)
            sb.append("CurrentDeployment: ").append(getCurrentDeployment()).append(",");
        if (getNextDeployment() != null)
            sb.append("NextDeployment: ").append(getNextDeployment()).append(",");
        if (getIsDisabled() != null)
            sb.append("IsDisabled: ").append(getIsDisabled()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getPrivateDomainName() != null)
            sb.append("PrivateDomainName: ").append(getPrivateDomainName()).append(",");
        if (getPublicDomainNames() != null)
            sb.append("PublicDomainNames: ").append(getPublicDomainNames()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerService == false)
            return false;
        ContainerService other = (ContainerService) obj;
        if (other.getContainerServiceName() == null ^ this.getContainerServiceName() == null)
            return false;
        if (other.getContainerServiceName() != null && other.getContainerServiceName().equals(this.getContainerServiceName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPower() == null ^ this.getPower() == null)
            return false;
        if (other.getPower() != null && other.getPower().equals(this.getPower()) == false)
            return false;
        if (other.getPowerId() == null ^ this.getPowerId() == null)
            return false;
        if (other.getPowerId() != null && other.getPowerId().equals(this.getPowerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateDetail() == null ^ this.getStateDetail() == null)
            return false;
        if (other.getStateDetail() != null && other.getStateDetail().equals(this.getStateDetail()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getCurrentDeployment() == null ^ this.getCurrentDeployment() == null)
            return false;
        if (other.getCurrentDeployment() != null && other.getCurrentDeployment().equals(this.getCurrentDeployment()) == false)
            return false;
        if (other.getNextDeployment() == null ^ this.getNextDeployment() == null)
            return false;
        if (other.getNextDeployment() != null && other.getNextDeployment().equals(this.getNextDeployment()) == false)
            return false;
        if (other.getIsDisabled() == null ^ this.getIsDisabled() == null)
            return false;
        if (other.getIsDisabled() != null && other.getIsDisabled().equals(this.getIsDisabled()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getPrivateDomainName() == null ^ this.getPrivateDomainName() == null)
            return false;
        if (other.getPrivateDomainName() != null && other.getPrivateDomainName().equals(this.getPrivateDomainName()) == false)
            return false;
        if (other.getPublicDomainNames() == null ^ this.getPublicDomainNames() == null)
            return false;
        if (other.getPublicDomainNames() != null && other.getPublicDomainNames().equals(this.getPublicDomainNames()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerServiceName() == null) ? 0 : getContainerServiceName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPower() == null) ? 0 : getPower().hashCode());
        hashCode = prime * hashCode + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateDetail() == null) ? 0 : getStateDetail().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getCurrentDeployment() == null) ? 0 : getCurrentDeployment().hashCode());
        hashCode = prime * hashCode + ((getNextDeployment() == null) ? 0 : getNextDeployment().hashCode());
        hashCode = prime * hashCode + ((getIsDisabled() == null) ? 0 : getIsDisabled().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getPrivateDomainName() == null) ? 0 : getPrivateDomainName().hashCode());
        hashCode = prime * hashCode + ((getPublicDomainNames() == null) ? 0 : getPublicDomainNames().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ContainerService clone() {
        try {
            return (ContainerService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
