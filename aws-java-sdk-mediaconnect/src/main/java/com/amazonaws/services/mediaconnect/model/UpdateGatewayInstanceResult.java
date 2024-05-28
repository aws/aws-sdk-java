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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateGatewayInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If
     * it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to
     * this instance.
     */
    private String bridgePlacement;
    /** The Amazon Resource Name (ARN) of the instance. */
    private String gatewayInstanceArn;

    /**
     * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If
     * it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to
     * this instance.
     * 
     * @param bridgePlacement
     *        The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or
     *        AVAILABLE. If it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new
     *        bridges can be added to this instance.
     * @see BridgePlacement
     */

    public void setBridgePlacement(String bridgePlacement) {
        this.bridgePlacement = bridgePlacement;
    }

    /**
     * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If
     * it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to
     * this instance.
     * 
     * @return The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or
     *         AVAILABLE. If it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new
     *         bridges can be added to this instance.
     * @see BridgePlacement
     */

    public String getBridgePlacement() {
        return this.bridgePlacement;
    }

    /**
     * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If
     * it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to
     * this instance.
     * 
     * @param bridgePlacement
     *        The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or
     *        AVAILABLE. If it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new
     *        bridges can be added to this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgePlacement
     */

    public UpdateGatewayInstanceResult withBridgePlacement(String bridgePlacement) {
        setBridgePlacement(bridgePlacement);
        return this;
    }

    /**
     * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If
     * it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to
     * this instance.
     * 
     * @param bridgePlacement
     *        The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or
     *        AVAILABLE. If it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new
     *        bridges can be added to this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgePlacement
     */

    public UpdateGatewayInstanceResult withBridgePlacement(BridgePlacement bridgePlacement) {
        this.bridgePlacement = bridgePlacement.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     */

    public void setGatewayInstanceArn(String gatewayInstanceArn) {
        this.gatewayInstanceArn = gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     * 
     * @return The Amazon Resource Name (ARN) of the instance.
     */

    public String getGatewayInstanceArn() {
        return this.gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayInstanceResult withGatewayInstanceArn(String gatewayInstanceArn) {
        setGatewayInstanceArn(gatewayInstanceArn);
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
        if (getBridgePlacement() != null)
            sb.append("BridgePlacement: ").append(getBridgePlacement()).append(",");
        if (getGatewayInstanceArn() != null)
            sb.append("GatewayInstanceArn: ").append(getGatewayInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayInstanceResult == false)
            return false;
        UpdateGatewayInstanceResult other = (UpdateGatewayInstanceResult) obj;
        if (other.getBridgePlacement() == null ^ this.getBridgePlacement() == null)
            return false;
        if (other.getBridgePlacement() != null && other.getBridgePlacement().equals(this.getBridgePlacement()) == false)
            return false;
        if (other.getGatewayInstanceArn() == null ^ this.getGatewayInstanceArn() == null)
            return false;
        if (other.getGatewayInstanceArn() != null && other.getGatewayInstanceArn().equals(this.getGatewayInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgePlacement() == null) ? 0 : getBridgePlacement().hashCode());
        hashCode = prime * hashCode + ((getGatewayInstanceArn() == null) ? 0 : getGatewayInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayInstanceResult clone() {
        try {
            return (UpdateGatewayInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
