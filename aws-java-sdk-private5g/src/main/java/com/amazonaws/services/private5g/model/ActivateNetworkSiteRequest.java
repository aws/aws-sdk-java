/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateNetworkSite"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateNetworkSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     */
    private String networkSiteArn;
    /**
     * <p>
     * The shipping address of the network site.
     * </p>
     */
    private Address shippingAddress;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateNetworkSiteRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site.
     */

    public void setNetworkSiteArn(String networkSiteArn) {
        this.networkSiteArn = networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network site.
     */

    public String getNetworkSiteArn() {
        return this.networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateNetworkSiteRequest withNetworkSiteArn(String networkSiteArn) {
        setNetworkSiteArn(networkSiteArn);
        return this;
    }

    /**
     * <p>
     * The shipping address of the network site.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address of the network site.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The shipping address of the network site.
     * </p>
     * 
     * @return The shipping address of the network site.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The shipping address of the network site.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateNetworkSiteRequest withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getNetworkSiteArn() != null)
            sb.append("NetworkSiteArn: ").append(getNetworkSiteArn()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateNetworkSiteRequest == false)
            return false;
        ActivateNetworkSiteRequest other = (ActivateNetworkSiteRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNetworkSiteArn() == null ^ this.getNetworkSiteArn() == null)
            return false;
        if (other.getNetworkSiteArn() != null && other.getNetworkSiteArn().equals(this.getNetworkSiteArn()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteArn() == null) ? 0 : getNetworkSiteArn().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        return hashCode;
    }

    @Override
    public ActivateNetworkSiteRequest clone() {
        return (ActivateNetworkSiteRequest) super.clone();
    }

}
