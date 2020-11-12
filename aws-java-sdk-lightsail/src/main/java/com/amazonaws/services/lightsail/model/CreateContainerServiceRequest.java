/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the container service.
     * </p>
     * <p>
     * The name that you specify for your container service will make up part of its default domain. The default domain
     * of a container service is typically
     * <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If the name
     * of your container service is <code>container-service-1</code>, and it's located in the US East (Ohio) AWS region
     * (<code>us-east-2</code>), then the domain for your container service will be like the following example:
     * <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     * </p>
     * <p>
     * The following are the requirements for container service names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be unique within each AWS Region in your Lightsail account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain 1 to 63 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * A hyphen (-) can separate words but cannot be at the start or end of the name.
     * </p>
     * </li>
     * </ul>
     */
    private String serviceName;
    /**
     * <p>
     * The power specification for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify using
     * this parameter, and their base monthly cost.
     * </p>
     */
    private String power;
    /**
     * <p>
     * The scale specification for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     */
    private Integer scale;
    /**
     * <p>
     * The tag keys and optional values for the container service.
     * </p>
     * <p>
     * For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
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
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> publicDomainNames;
    /**
     * <p>
     * An object that describes a deployment for the container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     */
    private ContainerServiceDeploymentRequest deployment;

    /**
     * <p>
     * The name for the container service.
     * </p>
     * <p>
     * The name that you specify for your container service will make up part of its default domain. The default domain
     * of a container service is typically
     * <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If the name
     * of your container service is <code>container-service-1</code>, and it's located in the US East (Ohio) AWS region
     * (<code>us-east-2</code>), then the domain for your container service will be like the following example:
     * <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     * </p>
     * <p>
     * The following are the requirements for container service names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be unique within each AWS Region in your Lightsail account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain 1 to 63 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * A hyphen (-) can separate words but cannot be at the start or end of the name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceName
     *        The name for the container service.</p>
     *        <p>
     *        The name that you specify for your container service will make up part of its default domain. The default
     *        domain of a container service is typically
     *        <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If
     *        the name of your container service is <code>container-service-1</code>, and it's located in the US East
     *        (Ohio) AWS region (<code>us-east-2</code>), then the domain for your container service will be like the
     *        following example: <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     *        </p>
     *        <p>
     *        The following are the requirements for container service names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be unique within each AWS Region in your Lightsail account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters and hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A hyphen (-) can separate words but cannot be at the start or end of the name.
     *        </p>
     *        </li>
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name for the container service.
     * </p>
     * <p>
     * The name that you specify for your container service will make up part of its default domain. The default domain
     * of a container service is typically
     * <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If the name
     * of your container service is <code>container-service-1</code>, and it's located in the US East (Ohio) AWS region
     * (<code>us-east-2</code>), then the domain for your container service will be like the following example:
     * <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     * </p>
     * <p>
     * The following are the requirements for container service names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be unique within each AWS Region in your Lightsail account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain 1 to 63 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * A hyphen (-) can separate words but cannot be at the start or end of the name.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the container service.</p>
     *         <p>
     *         The name that you specify for your container service will make up part of its default domain. The default
     *         domain of a container service is typically
     *         <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If
     *         the name of your container service is <code>container-service-1</code>, and it's located in the US East
     *         (Ohio) AWS region (<code>us-east-2</code>), then the domain for your container service will be like the
     *         following example:
     *         <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     *         </p>
     *         <p>
     *         The following are the requirements for container service names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be unique within each AWS Region in your Lightsail account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain 1 to 63 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only alphanumeric characters and hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A hyphen (-) can separate words but cannot be at the start or end of the name.
     *         </p>
     *         </li>
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name for the container service.
     * </p>
     * <p>
     * The name that you specify for your container service will make up part of its default domain. The default domain
     * of a container service is typically
     * <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If the name
     * of your container service is <code>container-service-1</code>, and it's located in the US East (Ohio) AWS region
     * (<code>us-east-2</code>), then the domain for your container service will be like the following example:
     * <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     * </p>
     * <p>
     * The following are the requirements for container service names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be unique within each AWS Region in your Lightsail account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain 1 to 63 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * A hyphen (-) can separate words but cannot be at the start or end of the name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceName
     *        The name for the container service.</p>
     *        <p>
     *        The name that you specify for your container service will make up part of its default domain. The default
     *        domain of a container service is typically
     *        <code>https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com</code>. If
     *        the name of your container service is <code>container-service-1</code>, and it's located in the US East
     *        (Ohio) AWS region (<code>us-east-2</code>), then the domain for your container service will be like the
     *        following example: <code>https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com</code>
     *        </p>
     *        <p>
     *        The following are the requirements for container service names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be unique within each AWS Region in your Lightsail account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters and hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A hyphen (-) can separate words but cannot be at the start or end of the name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The power specification for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify using
     * this parameter, and their base monthly cost.
     * </p>
     * 
     * @param power
     *        The power specification for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify
     *        using this parameter, and their base monthly cost.
     * @see ContainerServicePowerName
     */

    public void setPower(String power) {
        this.power = power;
    }

    /**
     * <p>
     * The power specification for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify using
     * this parameter, and their base monthly cost.
     * </p>
     * 
     * @return The power specification for the container service.</p>
     *         <p>
     *         The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *         service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *         capacity. To determine the monthly price of your container service, multiply the base price of the
     *         <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *         </p>
     *         <p>
     *         Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify
     *         using this parameter, and their base monthly cost.
     * @see ContainerServicePowerName
     */

    public String getPower() {
        return this.power;
    }

    /**
     * <p>
     * The power specification for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify using
     * this parameter, and their base monthly cost.
     * </p>
     * 
     * @param power
     *        The power specification for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify
     *        using this parameter, and their base monthly cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public CreateContainerServiceRequest withPower(String power) {
        setPower(power);
        return this;
    }

    /**
     * <p>
     * The power specification for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify using
     * this parameter, and their base monthly cost.
     * </p>
     * 
     * @param power
     *        The power specification for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to get a list of power options that you can specify
     *        using this parameter, and their base monthly cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public CreateContainerServiceRequest withPower(ContainerServicePowerName power) {
        this.power = power.toString();
        return this;
    }

    /**
     * <p>
     * The scale specification for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @param scale
     *        The scale specification for the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *        <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price
     *        of your container service, multiply the base price of the <code>power</code> with the <code>scale</code>
     *        (the number of nodes) of the service.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale specification for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @return The scale specification for the container service.</p>
     *         <p>
     *         The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *         <code>scale</code> of a container service makes up its configured capacity. To determine the monthly
     *         price of your container service, multiply the base price of the <code>power</code> with the
     *         <code>scale</code> (the number of nodes) of the service.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale specification for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @param scale
     *        The scale specification for the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *        <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price
     *        of your container service, multiply the base price of the <code>power</code> with the <code>scale</code>
     *        (the number of nodes) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the container service.
     * </p>
     * <p>
     * For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the container service.</p>
     *         <p>
     *         For more information about tags in Lightsail, see the <a
     *         href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the container service.
     * </p>
     * <p>
     * For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the container service.</p>
     *        <p>
     *        For more information about tags in Lightsail, see the <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
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
     * The tag keys and optional values for the container service.
     * </p>
     * <p>
     * For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the container service.</p>
     *        <p>
     *        For more information about tags in Lightsail, see the <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withTags(Tag... tags) {
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
     * The tag keys and optional values for the container service.
     * </p>
     * <p>
     * For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the container service.</p>
     *        <p>
     *        For more information about tags in Lightsail, see the <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
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
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @return The public domain names to use with the container service, such as <code>example.com</code> and
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
     *         You can specify public domain names using a string to array map as shown in the example later on this
     *         page.
     */

    public java.util.Map<String, java.util.List<String>> getPublicDomainNames() {
        return publicDomainNames;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
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
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain names to use with the container service, such as <code>example.com</code> and
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
     *        You can specify public domain names using a string to array map as shown in the example later on this
     *        page.
     */

    public void setPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        this.publicDomainNames = publicDomainNames;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
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
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain names to use with the container service, such as <code>example.com</code> and
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
     *        You can specify public domain names using a string to array map as shown in the example later on this
     *        page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        setPublicDomainNames(publicDomainNames);
        return this;
    }

    /**
     * Add a single PublicDomainNames entry
     *
     * @see CreateContainerServiceRequest#withPublicDomainNames
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest addPublicDomainNamesEntry(String key, java.util.List<String> value) {
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

    public CreateContainerServiceRequest clearPublicDomainNamesEntries() {
        this.publicDomainNames = null;
        return this;
    }

    /**
     * <p>
     * An object that describes a deployment for the container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     * 
     * @param deployment
     *        An object that describes a deployment for the container service.</p>
     *        <p>
     *        A deployment specifies the containers that will be launched on the container service and their settings,
     *        such as the ports to open, the environment variables to apply, and the launch command to run. It also
     *        specifies the container that will serve as the public endpoint of the deployment and its settings, such as
     *        the HTTP or HTTPS port to use, and the health check configuration.
     */

    public void setDeployment(ContainerServiceDeploymentRequest deployment) {
        this.deployment = deployment;
    }

    /**
     * <p>
     * An object that describes a deployment for the container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     * 
     * @return An object that describes a deployment for the container service.</p>
     *         <p>
     *         A deployment specifies the containers that will be launched on the container service and their settings,
     *         such as the ports to open, the environment variables to apply, and the launch command to run. It also
     *         specifies the container that will serve as the public endpoint of the deployment and its settings, such
     *         as the HTTP or HTTPS port to use, and the health check configuration.
     */

    public ContainerServiceDeploymentRequest getDeployment() {
        return this.deployment;
    }

    /**
     * <p>
     * An object that describes a deployment for the container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     * 
     * @param deployment
     *        An object that describes a deployment for the container service.</p>
     *        <p>
     *        A deployment specifies the containers that will be launched on the container service and their settings,
     *        such as the ports to open, the environment variables to apply, and the launch command to run. It also
     *        specifies the container that will serve as the public endpoint of the deployment and its settings, such as
     *        the HTTP or HTTPS port to use, and the health check configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRequest withDeployment(ContainerServiceDeploymentRequest deployment) {
        setDeployment(deployment);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getPower() != null)
            sb.append("Power: ").append(getPower()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPublicDomainNames() != null)
            sb.append("PublicDomainNames: ").append(getPublicDomainNames()).append(",");
        if (getDeployment() != null)
            sb.append("Deployment: ").append(getDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerServiceRequest == false)
            return false;
        CreateContainerServiceRequest other = (CreateContainerServiceRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getPower() == null ^ this.getPower() == null)
            return false;
        if (other.getPower() != null && other.getPower().equals(this.getPower()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPublicDomainNames() == null ^ this.getPublicDomainNames() == null)
            return false;
        if (other.getPublicDomainNames() != null && other.getPublicDomainNames().equals(this.getPublicDomainNames()) == false)
            return false;
        if (other.getDeployment() == null ^ this.getDeployment() == null)
            return false;
        if (other.getDeployment() != null && other.getDeployment().equals(this.getDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getPower() == null) ? 0 : getPower().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPublicDomainNames() == null) ? 0 : getPublicDomainNames().hashCode());
        hashCode = prime * hashCode + ((getDeployment() == null) ? 0 : getDeployment().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerServiceRequest clone() {
        return (CreateContainerServiceRequest) super.clone();
    }

}
