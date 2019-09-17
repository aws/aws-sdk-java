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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteGatewayGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGatewayGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the gateway group to delete.
     * </p>
     */
    private String gatewayGroupArn;

    /**
     * <p>
     * The ARN of the gateway group to delete.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group to delete.
     */

    public void setGatewayGroupArn(String gatewayGroupArn) {
        this.gatewayGroupArn = gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group to delete.
     * </p>
     * 
     * @return The ARN of the gateway group to delete.
     */

    public String getGatewayGroupArn() {
        return this.gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group to delete.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGatewayGroupRequest withGatewayGroupArn(String gatewayGroupArn) {
        setGatewayGroupArn(gatewayGroupArn);
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
        if (getGatewayGroupArn() != null)
            sb.append("GatewayGroupArn: ").append(getGatewayGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGatewayGroupRequest == false)
            return false;
        DeleteGatewayGroupRequest other = (DeleteGatewayGroupRequest) obj;
        if (other.getGatewayGroupArn() == null ^ this.getGatewayGroupArn() == null)
            return false;
        if (other.getGatewayGroupArn() != null && other.getGatewayGroupArn().equals(this.getGatewayGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayGroupArn() == null) ? 0 : getGatewayGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGatewayGroupRequest clone() {
        return (DeleteGatewayGroupRequest) super.clone();
    }

}
