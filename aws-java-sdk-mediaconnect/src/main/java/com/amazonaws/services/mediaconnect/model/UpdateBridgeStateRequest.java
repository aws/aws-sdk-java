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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to update the bridge state.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the bridge that you want to update. */
    private String bridgeArn;

    private String desiredState;

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @return The ARN of the bridge that you want to update.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeStateRequest withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param desiredState
     * @see DesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * @return
     * @see DesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * @param desiredState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public UpdateBridgeStateRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * @param desiredState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredState
     */

    public UpdateBridgeStateRequest withDesiredState(DesiredState desiredState) {
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

        if (obj instanceof UpdateBridgeStateRequest == false)
            return false;
        UpdateBridgeStateRequest other = (UpdateBridgeStateRequest) obj;
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
    public UpdateBridgeStateRequest clone() {
        return (UpdateBridgeStateRequest) super.clone();
    }

}
