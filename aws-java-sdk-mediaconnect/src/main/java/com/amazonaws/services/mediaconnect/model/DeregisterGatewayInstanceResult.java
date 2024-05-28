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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeregisterGatewayInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterGatewayInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the instance. */
    private String gatewayInstanceArn;
    /** The status of the instance. */
    private String instanceState;

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

    public DeregisterGatewayInstanceResult withGatewayInstanceArn(String gatewayInstanceArn) {
        setGatewayInstanceArn(gatewayInstanceArn);
        return this;
    }

    /**
     * The status of the instance.
     * 
     * @param instanceState
     *        The status of the instance.
     * @see InstanceState
     */

    public void setInstanceState(String instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * The status of the instance.
     * 
     * @return The status of the instance.
     * @see InstanceState
     */

    public String getInstanceState() {
        return this.instanceState;
    }

    /**
     * The status of the instance.
     * 
     * @param instanceState
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceState
     */

    public DeregisterGatewayInstanceResult withInstanceState(String instanceState) {
        setInstanceState(instanceState);
        return this;
    }

    /**
     * The status of the instance.
     * 
     * @param instanceState
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceState
     */

    public DeregisterGatewayInstanceResult withInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState.toString();
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
        if (getGatewayInstanceArn() != null)
            sb.append("GatewayInstanceArn: ").append(getGatewayInstanceArn()).append(",");
        if (getInstanceState() != null)
            sb.append("InstanceState: ").append(getInstanceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterGatewayInstanceResult == false)
            return false;
        DeregisterGatewayInstanceResult other = (DeregisterGatewayInstanceResult) obj;
        if (other.getGatewayInstanceArn() == null ^ this.getGatewayInstanceArn() == null)
            return false;
        if (other.getGatewayInstanceArn() != null && other.getGatewayInstanceArn().equals(this.getGatewayInstanceArn()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayInstanceArn() == null) ? 0 : getGatewayInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterGatewayInstanceResult clone() {
        try {
            return (DeregisterGatewayInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
