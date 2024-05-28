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
 * Displays details of the selected bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListedBridge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedBridge implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the bridge. */
    private String bridgeArn;

    private String bridgeState;
    /** The type of the bridge. */
    private String bridgeType;
    /** The name of the bridge. */
    private String name;
    /** The ARN of the gateway associated with the bridge. */
    private String placementArn;

    /**
     * The ARN of the bridge.
     * 
     * @param bridgeArn
     *        The ARN of the bridge.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The ARN of the bridge.
     * 
     * @return The ARN of the bridge.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The ARN of the bridge.
     * 
     * @param bridgeArn
     *        The ARN of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedBridge withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param bridgeState
     * @see BridgeState
     */

    public void setBridgeState(String bridgeState) {
        this.bridgeState = bridgeState;
    }

    /**
     * @return
     * @see BridgeState
     */

    public String getBridgeState() {
        return this.bridgeState;
    }

    /**
     * @param bridgeState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgeState
     */

    public ListedBridge withBridgeState(String bridgeState) {
        setBridgeState(bridgeState);
        return this;
    }

    /**
     * @param bridgeState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgeState
     */

    public ListedBridge withBridgeState(BridgeState bridgeState) {
        this.bridgeState = bridgeState.toString();
        return this;
    }

    /**
     * The type of the bridge.
     * 
     * @param bridgeType
     *        The type of the bridge.
     */

    public void setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
    }

    /**
     * The type of the bridge.
     * 
     * @return The type of the bridge.
     */

    public String getBridgeType() {
        return this.bridgeType;
    }

    /**
     * The type of the bridge.
     * 
     * @param bridgeType
     *        The type of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedBridge withBridgeType(String bridgeType) {
        setBridgeType(bridgeType);
        return this;
    }

    /**
     * The name of the bridge.
     * 
     * @param name
     *        The name of the bridge.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the bridge.
     * 
     * @return The name of the bridge.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the bridge.
     * 
     * @param name
     *        The name of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedBridge withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The ARN of the gateway associated with the bridge.
     * 
     * @param placementArn
     *        The ARN of the gateway associated with the bridge.
     */

    public void setPlacementArn(String placementArn) {
        this.placementArn = placementArn;
    }

    /**
     * The ARN of the gateway associated with the bridge.
     * 
     * @return The ARN of the gateway associated with the bridge.
     */

    public String getPlacementArn() {
        return this.placementArn;
    }

    /**
     * The ARN of the gateway associated with the bridge.
     * 
     * @param placementArn
     *        The ARN of the gateway associated with the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedBridge withPlacementArn(String placementArn) {
        setPlacementArn(placementArn);
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
        if (getBridgeArn() != null)
            sb.append("BridgeArn: ").append(getBridgeArn()).append(",");
        if (getBridgeState() != null)
            sb.append("BridgeState: ").append(getBridgeState()).append(",");
        if (getBridgeType() != null)
            sb.append("BridgeType: ").append(getBridgeType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlacementArn() != null)
            sb.append("PlacementArn: ").append(getPlacementArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedBridge == false)
            return false;
        ListedBridge other = (ListedBridge) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getBridgeState() == null ^ this.getBridgeState() == null)
            return false;
        if (other.getBridgeState() != null && other.getBridgeState().equals(this.getBridgeState()) == false)
            return false;
        if (other.getBridgeType() == null ^ this.getBridgeType() == null)
            return false;
        if (other.getBridgeType() != null && other.getBridgeType().equals(this.getBridgeType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlacementArn() == null ^ this.getPlacementArn() == null)
            return false;
        if (other.getPlacementArn() != null && other.getPlacementArn().equals(this.getPlacementArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getBridgeState() == null) ? 0 : getBridgeState().hashCode());
        hashCode = prime * hashCode + ((getBridgeType() == null) ? 0 : getBridgeType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlacementArn() == null) ? 0 : getPlacementArn().hashCode());
        return hashCode;
    }

    @Override
    public ListedBridge clone() {
        try {
            return (ListedBridge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ListedBridgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
