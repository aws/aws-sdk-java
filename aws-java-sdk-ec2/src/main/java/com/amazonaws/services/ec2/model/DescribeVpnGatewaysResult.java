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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeVpnGateways.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpnGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more virtual private gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpnGateway> vpnGateways;

    /**
     * <p>
     * Information about one or more virtual private gateways.
     * </p>
     * 
     * @return Information about one or more virtual private gateways.
     */

    public java.util.List<VpnGateway> getVpnGateways() {
        if (vpnGateways == null) {
            vpnGateways = new com.amazonaws.internal.SdkInternalList<VpnGateway>();
        }
        return vpnGateways;
    }

    /**
     * <p>
     * Information about one or more virtual private gateways.
     * </p>
     * 
     * @param vpnGateways
     *        Information about one or more virtual private gateways.
     */

    public void setVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        if (vpnGateways == null) {
            this.vpnGateways = null;
            return;
        }

        this.vpnGateways = new com.amazonaws.internal.SdkInternalList<VpnGateway>(vpnGateways);
    }

    /**
     * <p>
     * Information about one or more virtual private gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpnGateways(java.util.Collection)} or {@link #withVpnGateways(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpnGateways
     *        Information about one or more virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysResult withVpnGateways(VpnGateway... vpnGateways) {
        if (this.vpnGateways == null) {
            setVpnGateways(new com.amazonaws.internal.SdkInternalList<VpnGateway>(vpnGateways.length));
        }
        for (VpnGateway ele : vpnGateways) {
            this.vpnGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more virtual private gateways.
     * </p>
     * 
     * @param vpnGateways
     *        Information about one or more virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysResult withVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        setVpnGateways(vpnGateways);
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
        if (getVpnGateways() != null)
            sb.append("VpnGateways: ").append(getVpnGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnGatewaysResult == false)
            return false;
        DescribeVpnGatewaysResult other = (DescribeVpnGatewaysResult) obj;
        if (other.getVpnGateways() == null ^ this.getVpnGateways() == null)
            return false;
        if (other.getVpnGateways() != null && other.getVpnGateways().equals(this.getVpnGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnGateways() == null) ? 0 : getVpnGateways().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpnGatewaysResult clone() {
        try {
            return (DescribeVpnGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
