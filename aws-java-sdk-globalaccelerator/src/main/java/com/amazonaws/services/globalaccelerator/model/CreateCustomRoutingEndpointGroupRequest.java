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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomRoutingEndpointGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific
     * Region.
     * </p>
     */
    private String endpointGroupRegion;
    /**
     * <p>
     * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint
     * group to accept client traffic on.
     * </p>
     */
    private java.util.List<CustomRoutingDestinationConfiguration> destinationConfigurations;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener for a custom routing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingEndpointGroupRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific
     * Region.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a
     *        specific Region.
     */

    public void setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific
     * Region.
     * </p>
     * 
     * @return The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a
     *         specific Region.
     */

    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific
     * Region.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a
     *        specific Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingEndpointGroupRequest withEndpointGroupRegion(String endpointGroupRegion) {
        setEndpointGroupRegion(endpointGroupRegion);
        return this;
    }

    /**
     * <p>
     * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint
     * group to accept client traffic on.
     * </p>
     * 
     * @return Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing
     *         endpoint group to accept client traffic on.
     */

    public java.util.List<CustomRoutingDestinationConfiguration> getDestinationConfigurations() {
        return destinationConfigurations;
    }

    /**
     * <p>
     * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint
     * group to accept client traffic on.
     * </p>
     * 
     * @param destinationConfigurations
     *        Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing
     *        endpoint group to accept client traffic on.
     */

    public void setDestinationConfigurations(java.util.Collection<CustomRoutingDestinationConfiguration> destinationConfigurations) {
        if (destinationConfigurations == null) {
            this.destinationConfigurations = null;
            return;
        }

        this.destinationConfigurations = new java.util.ArrayList<CustomRoutingDestinationConfiguration>(destinationConfigurations);
    }

    /**
     * <p>
     * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint
     * group to accept client traffic on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationConfigurations(java.util.Collection)} or
     * {@link #withDestinationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationConfigurations
     *        Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing
     *        endpoint group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingEndpointGroupRequest withDestinationConfigurations(CustomRoutingDestinationConfiguration... destinationConfigurations) {
        if (this.destinationConfigurations == null) {
            setDestinationConfigurations(new java.util.ArrayList<CustomRoutingDestinationConfiguration>(destinationConfigurations.length));
        }
        for (CustomRoutingDestinationConfiguration ele : destinationConfigurations) {
            this.destinationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing endpoint
     * group to accept client traffic on.
     * </p>
     * 
     * @param destinationConfigurations
     *        Sets the port range and protocol for all endpoints (virtual private cloud subnets) in a custom routing
     *        endpoint group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingEndpointGroupRequest withDestinationConfigurations(
            java.util.Collection<CustomRoutingDestinationConfiguration> destinationConfigurations) {
        setDestinationConfigurations(destinationConfigurations);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *         the request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingEndpointGroupRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getEndpointGroupRegion() != null)
            sb.append("EndpointGroupRegion: ").append(getEndpointGroupRegion()).append(",");
        if (getDestinationConfigurations() != null)
            sb.append("DestinationConfigurations: ").append(getDestinationConfigurations()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomRoutingEndpointGroupRequest == false)
            return false;
        CreateCustomRoutingEndpointGroupRequest other = (CreateCustomRoutingEndpointGroupRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getEndpointGroupRegion() == null ^ this.getEndpointGroupRegion() == null)
            return false;
        if (other.getEndpointGroupRegion() != null && other.getEndpointGroupRegion().equals(this.getEndpointGroupRegion()) == false)
            return false;
        if (other.getDestinationConfigurations() == null ^ this.getDestinationConfigurations() == null)
            return false;
        if (other.getDestinationConfigurations() != null && other.getDestinationConfigurations().equals(this.getDestinationConfigurations()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupRegion() == null) ? 0 : getEndpointGroupRegion().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfigurations() == null) ? 0 : getDestinationConfigurations().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomRoutingEndpointGroupRequest clone() {
        return (CreateCustomRoutingEndpointGroupRequest) super.clone();
    }

}
