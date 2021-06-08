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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for the endpoint group for a custom routing accelerator. An AWS Region can have only one endpoint
 * group for a specific listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CustomRoutingEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRoutingEndpointGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * The AWS Region where the endpoint group is located.
     * </p>
     */
    private String endpointGroupRegion;
    /**
     * <p>
     * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud
     * subnets) in an endpoint group to accept client traffic on.
     * </p>
     */
    private java.util.List<CustomRoutingDestinationDescription> destinationDescriptions;
    /**
     * <p>
     * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to
     * accept client traffic on.
     * </p>
     */
    private java.util.List<CustomRoutingEndpointDescription> endpointDescriptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region where the endpoint group is located.
     */

    public void setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located.
     * </p>
     * 
     * @return The AWS Region where the endpoint group is located.
     */

    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region where the endpoint group is located.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region where the endpoint group is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withEndpointGroupRegion(String endpointGroupRegion) {
        setEndpointGroupRegion(endpointGroupRegion);
        return this;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud
     * subnets) in an endpoint group to accept client traffic on.
     * </p>
     * 
     * @return For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual
     *         private cloud subnets) in an endpoint group to accept client traffic on.
     */

    public java.util.List<CustomRoutingDestinationDescription> getDestinationDescriptions() {
        return destinationDescriptions;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud
     * subnets) in an endpoint group to accept client traffic on.
     * </p>
     * 
     * @param destinationDescriptions
     *        For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private
     *        cloud subnets) in an endpoint group to accept client traffic on.
     */

    public void setDestinationDescriptions(java.util.Collection<CustomRoutingDestinationDescription> destinationDescriptions) {
        if (destinationDescriptions == null) {
            this.destinationDescriptions = null;
            return;
        }

        this.destinationDescriptions = new java.util.ArrayList<CustomRoutingDestinationDescription>(destinationDescriptions);
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud
     * subnets) in an endpoint group to accept client traffic on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationDescriptions(java.util.Collection)} or
     * {@link #withDestinationDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationDescriptions
     *        For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private
     *        cloud subnets) in an endpoint group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withDestinationDescriptions(CustomRoutingDestinationDescription... destinationDescriptions) {
        if (this.destinationDescriptions == null) {
            setDestinationDescriptions(new java.util.ArrayList<CustomRoutingDestinationDescription>(destinationDescriptions.length));
        }
        for (CustomRoutingDestinationDescription ele : destinationDescriptions) {
            this.destinationDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud
     * subnets) in an endpoint group to accept client traffic on.
     * </p>
     * 
     * @param destinationDescriptions
     *        For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private
     *        cloud subnets) in an endpoint group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withDestinationDescriptions(java.util.Collection<CustomRoutingDestinationDescription> destinationDescriptions) {
        setDestinationDescriptions(destinationDescriptions);
        return this;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to
     * accept client traffic on.
     * </p>
     * 
     * @return For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint
     *         group to accept client traffic on.
     */

    public java.util.List<CustomRoutingEndpointDescription> getEndpointDescriptions() {
        return endpointDescriptions;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to
     * accept client traffic on.
     * </p>
     * 
     * @param endpointDescriptions
     *        For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint
     *        group to accept client traffic on.
     */

    public void setEndpointDescriptions(java.util.Collection<CustomRoutingEndpointDescription> endpointDescriptions) {
        if (endpointDescriptions == null) {
            this.endpointDescriptions = null;
            return;
        }

        this.endpointDescriptions = new java.util.ArrayList<CustomRoutingEndpointDescription>(endpointDescriptions);
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to
     * accept client traffic on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointDescriptions(java.util.Collection)} or {@link #withEndpointDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param endpointDescriptions
     *        For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint
     *        group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withEndpointDescriptions(CustomRoutingEndpointDescription... endpointDescriptions) {
        if (this.endpointDescriptions == null) {
            setEndpointDescriptions(new java.util.ArrayList<CustomRoutingEndpointDescription>(endpointDescriptions.length));
        }
        for (CustomRoutingEndpointDescription ele : endpointDescriptions) {
            this.endpointDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to
     * accept client traffic on.
     * </p>
     * 
     * @param endpointDescriptions
     *        For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint
     *        group to accept client traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointGroup withEndpointDescriptions(java.util.Collection<CustomRoutingEndpointDescription> endpointDescriptions) {
        setEndpointDescriptions(endpointDescriptions);
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
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn()).append(",");
        if (getEndpointGroupRegion() != null)
            sb.append("EndpointGroupRegion: ").append(getEndpointGroupRegion()).append(",");
        if (getDestinationDescriptions() != null)
            sb.append("DestinationDescriptions: ").append(getDestinationDescriptions()).append(",");
        if (getEndpointDescriptions() != null)
            sb.append("EndpointDescriptions: ").append(getEndpointDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRoutingEndpointGroup == false)
            return false;
        CustomRoutingEndpointGroup other = (CustomRoutingEndpointGroup) obj;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointGroupRegion() == null ^ this.getEndpointGroupRegion() == null)
            return false;
        if (other.getEndpointGroupRegion() != null && other.getEndpointGroupRegion().equals(this.getEndpointGroupRegion()) == false)
            return false;
        if (other.getDestinationDescriptions() == null ^ this.getDestinationDescriptions() == null)
            return false;
        if (other.getDestinationDescriptions() != null && other.getDestinationDescriptions().equals(this.getDestinationDescriptions()) == false)
            return false;
        if (other.getEndpointDescriptions() == null ^ this.getEndpointDescriptions() == null)
            return false;
        if (other.getEndpointDescriptions() != null && other.getEndpointDescriptions().equals(this.getEndpointDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupRegion() == null) ? 0 : getEndpointGroupRegion().hashCode());
        hashCode = prime * hashCode + ((getDestinationDescriptions() == null) ? 0 : getDestinationDescriptions().hashCode());
        hashCode = prime * hashCode + ((getEndpointDescriptions() == null) ? 0 : getEndpointDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public CustomRoutingEndpointGroup clone() {
        try {
            return (CustomRoutingEndpointGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.CustomRoutingEndpointGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
