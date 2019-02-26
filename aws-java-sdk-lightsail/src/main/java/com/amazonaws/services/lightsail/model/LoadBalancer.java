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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Lightsail load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail automatically
     * creates your load balancer across Availability Zones.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * </p>
     */
    private java.util.List<Integer> publicPorts;
    /**
     * <p>
     * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a
     * request to the default (root) page.
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80.
     * For HTTPS traffic, it's port 443.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the load balancer.
     * </p>
     */
    private java.util.List<InstanceHealthSummary> instanceHealthSummary;
    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS
     * certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries;
    /**
     * <p>
     * A string to string map of the configuration options for your load balancer. Valid values are listed below.
     * </p>
     */
    private java.util.Map<String, String> configurationOptions;

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * 
     * @param name
     *        The name of the load balancer (e.g., <code>my-load-balancer</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * 
     * @return The name of the load balancer (e.g., <code>my-load-balancer</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * 
     * @param name
     *        The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        load balancer. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         load balancer. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        load balancer. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     * 
     * @param createdAt
     *        The date when your load balancer was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     * 
     * @return The date when your load balancer was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     * 
     * @param createdAt
     *        The date when your load balancer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail automatically
     * creates your load balancer across Availability Zones.
     * </p>
     * 
     * @param location
     *        The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail
     *        automatically creates your load balancer across Availability Zones.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail automatically
     * creates your load balancer across Availability Zones.
     * </p>
     * 
     * @return The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail
     *         automatically creates your load balancer across Availability Zones.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail automatically
     * creates your load balancer across Availability Zones.
     * </p>
     * 
     * @param location
     *        The AWS Region where your load balancer was created (e.g., <code>us-east-2a</code>). Lightsail
     *        automatically creates your load balancer across Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancer</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * 
     * @return The resource type (e.g., <code>LoadBalancer</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LoadBalancer withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LoadBalancer withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
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
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTags(Tag... tags) {
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
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of your Lightsail load balancer.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * 
     * @return The DNS name of your Lightsail load balancer.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of your Lightsail load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * 
     * @param state
     *        The status of your load balancer. Valid values are below.
     * @see LoadBalancerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * 
     * @return The status of your load balancer. Valid values are below.
     * @see LoadBalancerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * 
     * @param state
     *        The status of your load balancer. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerState
     */

    public LoadBalancer withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * 
     * @param state
     *        The status of your load balancer. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerState
     */

    public LoadBalancer withState(LoadBalancerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol you have enabled for your load balancer. Valid values are below.</p>
     *        <p>
     *        You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * @see LoadBalancerProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * </p>
     * 
     * @return The protocol you have enabled for your load balancer. Valid values are below.</p>
     *         <p>
     *         You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * @see LoadBalancerProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol you have enabled for your load balancer. Valid values are below.</p>
     *        <p>
     *        You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerProtocol
     */

    public LoadBalancer withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol you have enabled for your load balancer. Valid values are below.</p>
     *        <p>
     *        You can't just have <code>HTTP_HTTPS</code>, but you can have just <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerProtocol
     */

    public LoadBalancer withProtocol(LoadBalancerProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * </p>
     * 
     * @return An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     */

    public java.util.List<Integer> getPublicPorts() {
        return publicPorts;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * </p>
     * 
     * @param publicPorts
     *        An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     */

    public void setPublicPorts(java.util.Collection<Integer> publicPorts) {
        if (publicPorts == null) {
            this.publicPorts = null;
            return;
        }

        this.publicPorts = new java.util.ArrayList<Integer>(publicPorts);
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicPorts(java.util.Collection)} or {@link #withPublicPorts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicPorts
     *        An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withPublicPorts(Integer... publicPorts) {
        if (this.publicPorts == null) {
            setPublicPorts(new java.util.ArrayList<Integer>(publicPorts.length));
        }
        for (Integer ele : publicPorts) {
            this.publicPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * </p>
     * 
     * @param publicPorts
     *        An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withPublicPorts(java.util.Collection<Integer> publicPorts) {
        setPublicPorts(publicPorts);
        return this;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a
     * request to the default (root) page.
     * </p>
     * 
     * @param healthCheckPath
     *        The path you specified to perform your health checks. If no path is specified, the load balancer tries to
     *        make a request to the default (root) page.
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a
     * request to the default (root) page.
     * </p>
     * 
     * @return The path you specified to perform your health checks. If no path is specified, the load balancer tries to
     *         make a request to the default (root) page.
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a
     * request to the default (root) page.
     * </p>
     * 
     * @param healthCheckPath
     *        The path you specified to perform your health checks. If no path is specified, the load balancer tries to
     *        make a request to the default (root) page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80.
     * For HTTPS traffic, it's port 443.
     * </p>
     * 
     * @param instancePort
     *        The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's
     *        port 80. For HTTPS traffic, it's port 443.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80.
     * For HTTPS traffic, it's port 443.
     * </p>
     * 
     * @return The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's
     *         port 80. For HTTPS traffic, it's port 443.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80.
     * For HTTPS traffic, it's port 443.
     * </p>
     * 
     * @param instancePort
     *        The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's
     *        port 80. For HTTPS traffic, it's port 443.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the load balancer.
     * </p>
     * 
     * @return An array of InstanceHealthSummary objects describing the health of the load balancer.
     */

    public java.util.List<InstanceHealthSummary> getInstanceHealthSummary() {
        return instanceHealthSummary;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the load balancer.
     * </p>
     * 
     * @param instanceHealthSummary
     *        An array of InstanceHealthSummary objects describing the health of the load balancer.
     */

    public void setInstanceHealthSummary(java.util.Collection<InstanceHealthSummary> instanceHealthSummary) {
        if (instanceHealthSummary == null) {
            this.instanceHealthSummary = null;
            return;
        }

        this.instanceHealthSummary = new java.util.ArrayList<InstanceHealthSummary>(instanceHealthSummary);
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceHealthSummary(java.util.Collection)} or
     * {@link #withInstanceHealthSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceHealthSummary
     *        An array of InstanceHealthSummary objects describing the health of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withInstanceHealthSummary(InstanceHealthSummary... instanceHealthSummary) {
        if (this.instanceHealthSummary == null) {
            setInstanceHealthSummary(new java.util.ArrayList<InstanceHealthSummary>(instanceHealthSummary.length));
        }
        for (InstanceHealthSummary ele : instanceHealthSummary) {
            this.instanceHealthSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the load balancer.
     * </p>
     * 
     * @param instanceHealthSummary
     *        An array of InstanceHealthSummary objects describing the health of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withInstanceHealthSummary(java.util.Collection<InstanceHealthSummary> instanceHealthSummary) {
        setInstanceHealthSummary(instanceHealthSummary);
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS
     * certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * 
     * @return An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the
     *         SSL/TLS certificates. For example, if <code>true</code>, the certificate is attached to the load
     *         balancer.
     */

    public java.util.List<LoadBalancerTlsCertificateSummary> getTlsCertificateSummaries() {
        return tlsCertificateSummaries;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS
     * certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * 
     * @param tlsCertificateSummaries
     *        An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the
     *        SSL/TLS certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     */

    public void setTlsCertificateSummaries(java.util.Collection<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries) {
        if (tlsCertificateSummaries == null) {
            this.tlsCertificateSummaries = null;
            return;
        }

        this.tlsCertificateSummaries = new java.util.ArrayList<LoadBalancerTlsCertificateSummary>(tlsCertificateSummaries);
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS
     * certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTlsCertificateSummaries(java.util.Collection)} or
     * {@link #withTlsCertificateSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tlsCertificateSummaries
     *        An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the
     *        SSL/TLS certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTlsCertificateSummaries(LoadBalancerTlsCertificateSummary... tlsCertificateSummaries) {
        if (this.tlsCertificateSummaries == null) {
            setTlsCertificateSummaries(new java.util.ArrayList<LoadBalancerTlsCertificateSummary>(tlsCertificateSummaries.length));
        }
        for (LoadBalancerTlsCertificateSummary ele : tlsCertificateSummaries) {
            this.tlsCertificateSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS
     * certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * 
     * @param tlsCertificateSummaries
     *        An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the
     *        SSL/TLS certificates. For example, if <code>true</code>, the certificate is attached to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTlsCertificateSummaries(java.util.Collection<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries) {
        setTlsCertificateSummaries(tlsCertificateSummaries);
        return this;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load balancer. Valid values are listed below.
     * </p>
     * 
     * @return A string to string map of the configuration options for your load balancer. Valid values are listed
     *         below.
     */

    public java.util.Map<String, String> getConfigurationOptions() {
        return configurationOptions;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load balancer. Valid values are listed below.
     * </p>
     * 
     * @param configurationOptions
     *        A string to string map of the configuration options for your load balancer. Valid values are listed below.
     */

    public void setConfigurationOptions(java.util.Map<String, String> configurationOptions) {
        this.configurationOptions = configurationOptions;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load balancer. Valid values are listed below.
     * </p>
     * 
     * @param configurationOptions
     *        A string to string map of the configuration options for your load balancer. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withConfigurationOptions(java.util.Map<String, String> configurationOptions) {
        setConfigurationOptions(configurationOptions);
        return this;
    }

    public LoadBalancer addConfigurationOptionsEntry(String key, String value) {
        if (null == this.configurationOptions) {
            this.configurationOptions = new java.util.HashMap<String, String>();
        }
        if (this.configurationOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configurationOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConfigurationOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer clearConfigurationOptionsEntries() {
        this.configurationOptions = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPublicPorts() != null)
            sb.append("PublicPorts: ").append(getPublicPorts()).append(",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: ").append(getHealthCheckPath()).append(",");
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort()).append(",");
        if (getInstanceHealthSummary() != null)
            sb.append("InstanceHealthSummary: ").append(getInstanceHealthSummary()).append(",");
        if (getTlsCertificateSummaries() != null)
            sb.append("TlsCertificateSummaries: ").append(getTlsCertificateSummaries()).append(",");
        if (getConfigurationOptions() != null)
            sb.append("ConfigurationOptions: ").append(getConfigurationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancer == false)
            return false;
        LoadBalancer other = (LoadBalancer) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
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
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPublicPorts() == null ^ this.getPublicPorts() == null)
            return false;
        if (other.getPublicPorts() != null && other.getPublicPorts().equals(this.getPublicPorts()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getInstanceHealthSummary() == null ^ this.getInstanceHealthSummary() == null)
            return false;
        if (other.getInstanceHealthSummary() != null && other.getInstanceHealthSummary().equals(this.getInstanceHealthSummary()) == false)
            return false;
        if (other.getTlsCertificateSummaries() == null ^ this.getTlsCertificateSummaries() == null)
            return false;
        if (other.getTlsCertificateSummaries() != null && other.getTlsCertificateSummaries().equals(this.getTlsCertificateSummaries()) == false)
            return false;
        if (other.getConfigurationOptions() == null ^ this.getConfigurationOptions() == null)
            return false;
        if (other.getConfigurationOptions() != null && other.getConfigurationOptions().equals(this.getConfigurationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPublicPorts() == null) ? 0 : getPublicPorts().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode + ((getInstanceHealthSummary() == null) ? 0 : getInstanceHealthSummary().hashCode());
        hashCode = prime * hashCode + ((getTlsCertificateSummaries() == null) ? 0 : getTlsCertificateSummaries().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOptions() == null) ? 0 : getConfigurationOptions().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancer clone() {
        try {
            return (LoadBalancer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
