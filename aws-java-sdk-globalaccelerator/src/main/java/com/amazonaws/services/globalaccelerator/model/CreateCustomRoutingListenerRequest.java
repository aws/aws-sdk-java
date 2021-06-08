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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomRoutingListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     * </p>
     */
    private String acceleratorArn;
    /**
     * <p>
     * The port range to support for connections from clients to your accelerator.
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
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator for a custom routing listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingListenerRequest withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
        return this;
    }

    /**
     * <p>
     * The port range to support for connections from clients to your accelerator.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @return The port range to support for connections from clients to your accelerator.</p>
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
     * The port range to support for connections from clients to your accelerator.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @param portRanges
     *        The port range to support for connections from clients to your accelerator.</p>
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
     * The port range to support for connections from clients to your accelerator.
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
     *        The port range to support for connections from clients to your accelerator.</p>
     *        <p>
     *        Separately, you set port ranges for endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *        endpoints for custom routing accelerators</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingListenerRequest withPortRanges(PortRange... portRanges) {
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
     * The port range to support for connections from clients to your accelerator.
     * </p>
     * <p>
     * Separately, you set port ranges for endpoints. For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     * endpoints for custom routing accelerators</a>.
     * </p>
     * 
     * @param portRanges
     *        The port range to support for connections from clients to your accelerator.</p>
     *        <p>
     *        Separately, you set port ranges for endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-custom-routing-endpoints.html">About
     *        endpoints for custom routing accelerators</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingListenerRequest withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
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

    public CreateCustomRoutingListenerRequest withIdempotencyToken(String idempotencyToken) {
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn()).append(",");
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges()).append(",");
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

        if (obj instanceof CreateCustomRoutingListenerRequest == false)
            return false;
        CreateCustomRoutingListenerRequest other = (CreateCustomRoutingListenerRequest) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
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

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomRoutingListenerRequest clone() {
        return (CreateCustomRoutingListenerRequest) super.clone();
    }

}
