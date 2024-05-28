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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The bridge's source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/BridgeSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BridgeSource implements Serializable, Cloneable, StructuredPojo {

    private BridgeFlowSource flowSource;

    private BridgeNetworkSource networkSource;

    /**
     * @param flowSource
     */

    public void setFlowSource(BridgeFlowSource flowSource) {
        this.flowSource = flowSource;
    }

    /**
     * @return
     */

    public BridgeFlowSource getFlowSource() {
        return this.flowSource;
    }

    /**
     * @param flowSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeSource withFlowSource(BridgeFlowSource flowSource) {
        setFlowSource(flowSource);
        return this;
    }

    /**
     * @param networkSource
     */

    public void setNetworkSource(BridgeNetworkSource networkSource) {
        this.networkSource = networkSource;
    }

    /**
     * @return
     */

    public BridgeNetworkSource getNetworkSource() {
        return this.networkSource;
    }

    /**
     * @param networkSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BridgeSource withNetworkSource(BridgeNetworkSource networkSource) {
        setNetworkSource(networkSource);
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
        if (getFlowSource() != null)
            sb.append("FlowSource: ").append(getFlowSource()).append(",");
        if (getNetworkSource() != null)
            sb.append("NetworkSource: ").append(getNetworkSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BridgeSource == false)
            return false;
        BridgeSource other = (BridgeSource) obj;
        if (other.getFlowSource() == null ^ this.getFlowSource() == null)
            return false;
        if (other.getFlowSource() != null && other.getFlowSource().equals(this.getFlowSource()) == false)
            return false;
        if (other.getNetworkSource() == null ^ this.getNetworkSource() == null)
            return false;
        if (other.getNetworkSource() != null && other.getNetworkSource().equals(this.getNetworkSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowSource() == null) ? 0 : getFlowSource().hashCode());
        hashCode = prime * hashCode + ((getNetworkSource() == null) ? 0 : getNetworkSource().hashCode());
        return hashCode;
    }

    @Override
    public BridgeSource clone() {
        try {
            return (BridgeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.BridgeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
