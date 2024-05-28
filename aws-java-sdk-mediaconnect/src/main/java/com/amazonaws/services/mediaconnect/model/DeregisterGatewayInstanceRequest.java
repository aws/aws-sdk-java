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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeregisterGatewayInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterGatewayInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on
     * it.
     */
    private Boolean force;
    /** The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister. */
    private String gatewayInstanceArn;

    /**
     * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on
     * it.
     * 
     * @param force
     *        Force the deregistration of an instance. Force will deregister an instance, even if there are bridges
     *        running on it.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on
     * it.
     * 
     * @return Force the deregistration of an instance. Force will deregister an instance, even if there are bridges
     *         running on it.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on
     * it.
     * 
     * @param force
     *        Force the deregistration of an instance. Force will deregister an instance, even if there are bridges
     *        running on it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterGatewayInstanceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * Force the deregistration of an instance. Force will deregister an instance, even if there are bridges running on
     * it.
     * 
     * @return Force the deregistration of an instance. Force will deregister an instance, even if there are bridges
     *         running on it.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     */

    public void setGatewayInstanceArn(String gatewayInstanceArn) {
        this.gatewayInstanceArn = gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     * 
     * @return The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     */

    public String getGatewayInstanceArn() {
        return this.gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the gateway that contains the instance that you want to deregister.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterGatewayInstanceRequest withGatewayInstanceArn(String gatewayInstanceArn) {
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
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
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

        if (obj instanceof DeregisterGatewayInstanceRequest == false)
            return false;
        DeregisterGatewayInstanceRequest other = (DeregisterGatewayInstanceRequest) obj;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
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

        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getGatewayInstanceArn() == null) ? 0 : getGatewayInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterGatewayInstanceRequest clone() {
        return (DeregisterGatewayInstanceRequest) super.clone();
    }

}
