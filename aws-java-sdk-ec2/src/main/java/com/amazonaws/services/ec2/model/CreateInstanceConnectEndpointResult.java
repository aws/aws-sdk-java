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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceConnectEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoint.
     * </p>
     */
    private Ec2InstanceConnectEndpoint instanceConnectEndpoint;
    /**
     * <p>
     * Unique, case-sensitive idempotency token provided by the client in the the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpoint
     *        Information about the EC2 Instance Connect Endpoint.
     */

    public void setInstanceConnectEndpoint(Ec2InstanceConnectEndpoint instanceConnectEndpoint) {
        this.instanceConnectEndpoint = instanceConnectEndpoint;
    }

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return Information about the EC2 Instance Connect Endpoint.
     */

    public Ec2InstanceConnectEndpoint getInstanceConnectEndpoint() {
        return this.instanceConnectEndpoint;
    }

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpoint
     *        Information about the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointResult withInstanceConnectEndpoint(Ec2InstanceConnectEndpoint instanceConnectEndpoint) {
        setInstanceConnectEndpoint(instanceConnectEndpoint);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive idempotency token provided by the client in the the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive idempotency token provided by the client in the the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive idempotency token provided by the client in the the request.
     * </p>
     * 
     * @return Unique, case-sensitive idempotency token provided by the client in the the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive idempotency token provided by the client in the the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive idempotency token provided by the client in the the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointResult withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceConnectEndpoint() != null)
            sb.append("InstanceConnectEndpoint: ").append(getInstanceConnectEndpoint()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceConnectEndpointResult == false)
            return false;
        CreateInstanceConnectEndpointResult other = (CreateInstanceConnectEndpointResult) obj;
        if (other.getInstanceConnectEndpoint() == null ^ this.getInstanceConnectEndpoint() == null)
            return false;
        if (other.getInstanceConnectEndpoint() != null && other.getInstanceConnectEndpoint().equals(this.getInstanceConnectEndpoint()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceConnectEndpoint() == null) ? 0 : getInstanceConnectEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceConnectEndpointResult clone() {
        try {
            return (CreateInstanceConnectEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
