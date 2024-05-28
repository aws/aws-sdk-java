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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeGatewayInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the gateway instance that you want to describe. */
    private String gatewayInstanceArn;

    /**
     * The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     */

    public void setGatewayInstanceArn(String gatewayInstanceArn) {
        this.gatewayInstanceArn = gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     * 
     * @return The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     */

    public String getGatewayInstanceArn() {
        return this.gatewayInstanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     * 
     * @param gatewayInstanceArn
     *        The Amazon Resource Name (ARN) of the gateway instance that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayInstanceRequest withGatewayInstanceArn(String gatewayInstanceArn) {
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

        if (obj instanceof DescribeGatewayInstanceRequest == false)
            return false;
        DescribeGatewayInstanceRequest other = (DescribeGatewayInstanceRequest) obj;
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

        hashCode = prime * hashCode + ((getGatewayInstanceArn() == null) ? 0 : getGatewayInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGatewayInstanceRequest clone() {
        return (DescribeGatewayInstanceRequest) super.clone();
    }

}
