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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomRoutingListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The updated port range to support for connections from clients to your accelerator. If you remove ports that are
     * currently being used by a subnet endpoint, the call fails.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     */
    private java.util.List<PortRange> portRanges;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener to update.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener to update.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomRoutingListenerRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The updated port range to support for connections from clients to your accelerator. If you remove ports that are
     * currently being used by a subnet endpoint, the call fails.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @return The updated port range to support for connections from clients to your accelerator. If you remove ports
     *         that are currently being used by a subnet endpoint, the call fails.</p>
     *         <p>
     *         Separately, you set port ranges for endpoints. For more information, see <a
     *         href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *         endpoints for custom routing accelerators</a>.
     */

    public java.util.List<PortRange> getPortRanges() {
        return portRanges;
    }

    /**
     * <p>
     * The updated port range to support for connections from clients to your accelerator. If you remove ports that are
     * currently being used by a subnet endpoint, the call fails.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @param portRanges
     *        The updated port range to support for connections from clients to your accelerator. If you remove ports
     *        that are currently being used by a subnet endpoint, the call fails.</p>
     *        <p>
     *        Separately, you set port ranges for endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *        endpoints for custom routing accelerators</a>.
     */

    public void setPortRanges(java.util.Collection<PortRange> portRanges) {
        if (portRanges == null) {
            this.portRanges = null;
            return;
        }

        this.portRanges = new java.util.ArrayList<PortRange>(portRanges);
    }

    /**
     * <p>
     * The updated port range to support for connections from clients to your accelerator. If you remove ports that are
     * currently being used by a subnet endpoint, the call fails.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRanges(java.util.Collection)} or {@link #withPortRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRanges
     *        The updated port range to support for connections from clients to your accelerator. If you remove ports
     *        that are currently being used by a subnet endpoint, the call fails.</p>
     *        <p>
     *        Separately, you set port ranges for endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *        endpoints for custom routing accelerators</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomRoutingListenerRequest withPortRanges(PortRange... portRanges) {
        if (this.portRanges == null) {
            setPortRanges(new java.util.ArrayList<PortRange>(portRanges.length));
        }
        for (PortRange ele : portRanges) {
            this.portRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated port range to support for connections from clients to your accelerator. If you remove ports that are
     * currently being used by a subnet endpoint, the call fails.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @param portRanges
     *        The updated port range to support for connections from clients to your accelerator. If you remove ports
     *        that are currently being used by a subnet endpoint, the call fails.</p>
     *        <p>
     *        Separately, you set port ranges for endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *        endpoints for custom routing accelerators</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomRoutingListenerRequest withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
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
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomRoutingListenerRequest == false)
            return false;
        UpdateCustomRoutingListenerRequest other = (UpdateCustomRoutingListenerRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomRoutingListenerRequest clone() {
        return (UpdateCustomRoutingListenerRequest) super.clone();
    }

}
