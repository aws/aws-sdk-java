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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the created gateway group.
     * </p>
     */
    private String gatewayGroupArn;

    /**
     * <p>
     * The ARN of the created gateway group.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the created gateway group.
     */

    public void setGatewayGroupArn(String gatewayGroupArn) {
        this.gatewayGroupArn = gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the created gateway group.
     * </p>
     * 
     * @return The ARN of the created gateway group.
     */

    public String getGatewayGroupArn() {
        return this.gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the created gateway group.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the created gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupResult withGatewayGroupArn(String gatewayGroupArn) {
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

        if (obj instanceof CreateGatewayGroupResult == false)
            return false;
        CreateGatewayGroupResult other = (CreateGatewayGroupResult) obj;
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
    public CreateGatewayGroupResult clone() {
        try {
            return (CreateGatewayGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
