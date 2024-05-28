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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries.
     * </p>
     * <p>
     * Updating to <code>IPV6</code> type isn't currently supported.
     * </p>
     */
    private String resolverEndpointType;
    /**
     * <p>
     * Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't specify an
     * IPv6 address, one will be automatically chosen from your subnet.
     * </p>
     */
    private java.util.List<UpdateIpAddress> updateIpAddresses;
    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the Resolver endpoint that you want to update.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @return The ID of the Resolver endpoint that you want to update.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the Resolver endpoint that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Resolver endpoint that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @return The name of the Resolver endpoint that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Resolver endpoint that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries.
     * </p>
     * <p>
     * Updating to <code>IPV6</code> type isn't currently supported.
     * </p>
     * 
     * @param resolverEndpointType
     *        Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries. </p>
     *        <p>
     *        Updating to <code>IPV6</code> type isn't currently supported.
     * @see ResolverEndpointType
     */

    public void setResolverEndpointType(String resolverEndpointType) {
        this.resolverEndpointType = resolverEndpointType;
    }

    /**
     * <p>
     * Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries.
     * </p>
     * <p>
     * Updating to <code>IPV6</code> type isn't currently supported.
     * </p>
     * 
     * @return Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries. </p>
     *         <p>
     *         Updating to <code>IPV6</code> type isn't currently supported.
     * @see ResolverEndpointType
     */

    public String getResolverEndpointType() {
        return this.resolverEndpointType;
    }

    /**
     * <p>
     * Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries.
     * </p>
     * <p>
     * Updating to <code>IPV6</code> type isn't currently supported.
     * </p>
     * 
     * @param resolverEndpointType
     *        Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries. </p>
     *        <p>
     *        Updating to <code>IPV6</code> type isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointType
     */

    public UpdateResolverEndpointRequest withResolverEndpointType(String resolverEndpointType) {
        setResolverEndpointType(resolverEndpointType);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries.
     * </p>
     * <p>
     * Updating to <code>IPV6</code> type isn't currently supported.
     * </p>
     * 
     * @param resolverEndpointType
     *        Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries. </p>
     *        <p>
     *        Updating to <code>IPV6</code> type isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverEndpointType
     */

    public UpdateResolverEndpointRequest withResolverEndpointType(ResolverEndpointType resolverEndpointType) {
        this.resolverEndpointType = resolverEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't specify an
     * IPv6 address, one will be automatically chosen from your subnet.
     * </p>
     * 
     * @return Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't
     *         specify an IPv6 address, one will be automatically chosen from your subnet.
     */

    public java.util.List<UpdateIpAddress> getUpdateIpAddresses() {
        return updateIpAddresses;
    }

    /**
     * <p>
     * Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't specify an
     * IPv6 address, one will be automatically chosen from your subnet.
     * </p>
     * 
     * @param updateIpAddresses
     *        Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't
     *        specify an IPv6 address, one will be automatically chosen from your subnet.
     */

    public void setUpdateIpAddresses(java.util.Collection<UpdateIpAddress> updateIpAddresses) {
        if (updateIpAddresses == null) {
            this.updateIpAddresses = null;
            return;
        }

        this.updateIpAddresses = new java.util.ArrayList<UpdateIpAddress>(updateIpAddresses);
    }

    /**
     * <p>
     * Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't specify an
     * IPv6 address, one will be automatically chosen from your subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateIpAddresses(java.util.Collection)} or {@link #withUpdateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param updateIpAddresses
     *        Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't
     *        specify an IPv6 address, one will be automatically chosen from your subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withUpdateIpAddresses(UpdateIpAddress... updateIpAddresses) {
        if (this.updateIpAddresses == null) {
            setUpdateIpAddresses(new java.util.ArrayList<UpdateIpAddress>(updateIpAddresses.length));
        }
        for (UpdateIpAddress ele : updateIpAddresses) {
            this.updateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't specify an
     * IPv6 address, one will be automatically chosen from your subnet.
     * </p>
     * 
     * @param updateIpAddresses
     *        Specifies the IPv6 address when you update the Resolver endpoint from IPv4 to dual-stack. If you don't
     *        specify an IPv6 address, one will be automatically chosen from your subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withUpdateIpAddresses(java.util.Collection<UpdateIpAddress> updateIpAddresses) {
        setUpdateIpAddresses(updateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     * 
     * @return The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *         <p>
     *         For an inbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 and DoH-FIPS in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH-FIPS alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For an outbound endpoint you can apply the protocols as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do53 and DoH in combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do53 alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DoH alone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         None, which is treated as Do53.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS.
     *         This is to prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol
     *         from Do53 to DoH, or DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make
     *         sure that all incoming traffic has transferred to using the DoH protocol, or DoH-FIPS, and then remove
     *         the Do53.
     *         </p>
     * @see Protocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS.
     *        This is to prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol
     *        from Do53 to DoH, or DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure
     *        that all incoming traffic has transferred to using the DoH protocol, or DoH-FIPS, and then remove the
     *        Do53.
     *        </p>
     * @see Protocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS.
     *        This is to prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol
     *        from Do53 to DoH, or DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure
     *        that all incoming traffic has transferred to using the DoH protocol, or DoH-FIPS, and then remove the
     *        Do53.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateResolverEndpointRequest withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS.
     *        This is to prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol
     *        from Do53 to DoH, or DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure
     *        that all incoming traffic has transferred to using the DoH protocol, or DoH-FIPS, and then remove the
     *        Do53.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateResolverEndpointRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     * </p>
     * <p>
     * For an inbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 and DoH-FIPS in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH-FIPS alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an outbound endpoint you can apply the protocols as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do53 and DoH in combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do53 alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * DoH alone.
     * </p>
     * </li>
     * <li>
     * <p>
     * None, which is treated as Do53.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS. This is to
     * prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol from Do53 to DoH, or
     * DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure that all incoming traffic
     * has transferred to using the DoH protocol, or DoH-FIPS, and then remove the Do53.
     * </p>
     * </important>
     * 
     * @param protocols
     *        The protocols you want to use for the endpoint. DoH-FIPS is applicable for inbound endpoints only. </p>
     *        <p>
     *        For an inbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 and DoH-FIPS in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH-FIPS alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an outbound endpoint you can apply the protocols as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do53 and DoH in combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do53 alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DoH alone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        None, which is treated as Do53.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        You can't change the protocol of an inbound endpoint directly from only Do53 to only DoH, or DoH-FIPS.
     *        This is to prevent a sudden disruption to incoming traffic that relies on Do53. To change the protocol
     *        from Do53 to DoH, or DoH-FIPS, you must first enable both Do53 and DoH, or Do53 and DoH-FIPS, to make sure
     *        that all incoming traffic has transferred to using the DoH protocol, or DoH-FIPS, and then remove the
     *        Do53.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateResolverEndpointRequest withProtocols(Protocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (Protocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResolverEndpointType() != null)
            sb.append("ResolverEndpointType: ").append(getResolverEndpointType()).append(",");
        if (getUpdateIpAddresses() != null)
            sb.append("UpdateIpAddresses: ").append(getUpdateIpAddresses()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverEndpointRequest == false)
            return false;
        UpdateResolverEndpointRequest other = (UpdateResolverEndpointRequest) obj;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResolverEndpointType() == null ^ this.getResolverEndpointType() == null)
            return false;
        if (other.getResolverEndpointType() != null && other.getResolverEndpointType().equals(this.getResolverEndpointType()) == false)
            return false;
        if (other.getUpdateIpAddresses() == null ^ this.getUpdateIpAddresses() == null)
            return false;
        if (other.getUpdateIpAddresses() != null && other.getUpdateIpAddresses().equals(this.getUpdateIpAddresses()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpointType() == null) ? 0 : getResolverEndpointType().hashCode());
        hashCode = prime * hashCode + ((getUpdateIpAddresses() == null) ? 0 : getUpdateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverEndpointRequest clone() {
        return (UpdateResolverEndpointRequest) super.clone();
    }

}
