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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Number (ARN) of the bridge. */
    private String bridgeArn;
    /** The state of the bridge. ACTIVE or STANDBY. */
    private String desiredState;

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @return The Amazon Resource Number (ARN) of the bridge.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeStateResult withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * The state of the bridge. ACTIVE or STANDBY.
     * 
     * @param desiredState
     *        The state of the bridge. ACTIVE or STANDBY.
     * @see DesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * The state of the bridge. ACTIVE or STANDBY.
     * 
     * @return The state of the bridge. ACTIVE or STANDBY.
     * @see DesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * The state of the bridge. ACTIVE or STANDBY.
     * 
     * @param desiredState
     *        The state of the bridge. ACTIVE or STANDBY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public UpdateBridgeStateResult withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * The state of the bridge. ACTIVE or STANDBY.
     * 
     * @param desiredState
     *        The state of the bridge. ACTIVE or STANDBY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public UpdateBridgeStateResult withDesiredState(DesiredState desiredState) {
        this.desiredState = desiredState.toString();
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeStateResult == false)
            return false;
        UpdateBridgeStateResult other = (UpdateBridgeStateResult) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeStateResult clone() {
        try {
            return (UpdateBridgeStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
