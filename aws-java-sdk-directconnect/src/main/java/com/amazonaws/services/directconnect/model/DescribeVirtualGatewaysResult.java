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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualGateways"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVirtualGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VirtualGateway> virtualGateways;

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * 
     * @return The virtual private gateways.
     */

    public java.util.List<VirtualGateway> getVirtualGateways() {
        if (virtualGateways == null) {
            virtualGateways = new com.amazonaws.internal.SdkInternalList<VirtualGateway>();
        }
        return virtualGateways;
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * 
     * @param virtualGateways
     *        The virtual private gateways.
     */

    public void setVirtualGateways(java.util.Collection<VirtualGateway> virtualGateways) {
        if (virtualGateways == null) {
            this.virtualGateways = null;
            return;
        }

        this.virtualGateways = new com.amazonaws.internal.SdkInternalList<VirtualGateway>(virtualGateways);
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualGateways(java.util.Collection)} or {@link #withVirtualGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param virtualGateways
     *        The virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualGatewaysResult withVirtualGateways(VirtualGateway... virtualGateways) {
        if (this.virtualGateways == null) {
            setVirtualGateways(new com.amazonaws.internal.SdkInternalList<VirtualGateway>(virtualGateways.length));
        }
        for (VirtualGateway ele : virtualGateways) {
            this.virtualGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * 
     * @param virtualGateways
     *        The virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualGatewaysResult withVirtualGateways(java.util.Collection<VirtualGateway> virtualGateways) {
        setVirtualGateways(virtualGateways);
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
        if (getVirtualGateways() != null)
            sb.append("VirtualGateways: ").append(getVirtualGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualGatewaysResult == false)
            return false;
        DescribeVirtualGatewaysResult other = (DescribeVirtualGatewaysResult) obj;
        if (other.getVirtualGateways() == null ^ this.getVirtualGateways() == null)
            return false;
        if (other.getVirtualGateways() != null && other.getVirtualGateways().equals(this.getVirtualGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualGateways() == null) ? 0 : getVirtualGateways().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVirtualGatewaysResult clone() {
        try {
            return (DescribeVirtualGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
