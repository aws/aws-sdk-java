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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<GatewayInfo> gateways;

    private String marker;

    /**
     * @return
     */

    public java.util.List<GatewayInfo> getGateways() {
        if (gateways == null) {
            gateways = new com.amazonaws.internal.SdkInternalList<GatewayInfo>();
        }
        return gateways;
    }

    /**
     * @param gateways
     */

    public void setGateways(java.util.Collection<GatewayInfo> gateways) {
        if (gateways == null) {
            this.gateways = null;
            return;
        }

        this.gateways = new com.amazonaws.internal.SdkInternalList<GatewayInfo>(gateways);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGateways(java.util.Collection)} or {@link #withGateways(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gateways
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGateways(GatewayInfo... gateways) {
        if (this.gateways == null) {
            setGateways(new com.amazonaws.internal.SdkInternalList<GatewayInfo>(gateways.length));
        }
        for (GatewayInfo ele : gateways) {
            this.gateways.add(ele);
        }
        return this;
    }

    /**
     * @param gateways
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGateways(java.util.Collection<GatewayInfo> gateways) {
        setGateways(gateways);
        return this;
    }

    /**
     * @param marker
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withMarker(String marker) {
        setMarker(marker);
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
        if (getGateways() != null)
            sb.append("Gateways: ").append(getGateways()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewaysResult == false)
            return false;
        ListGatewaysResult other = (ListGatewaysResult) obj;
        if (other.getGateways() == null ^ this.getGateways() == null)
            return false;
        if (other.getGateways() != null && other.getGateways().equals(this.getGateways()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGateways() == null) ? 0 : getGateways().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewaysResult clone() {
        try {
            return (ListGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
