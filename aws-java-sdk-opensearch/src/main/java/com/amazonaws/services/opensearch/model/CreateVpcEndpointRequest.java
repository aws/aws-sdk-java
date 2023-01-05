/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain to grant access to.
     * </p>
     */
    private String domainArn;
    /**
     * <p>
     * Options to specify the subnets and security groups for the endpoint.
     * </p>
     */
    private VPCOptions vpcOptions;
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain to grant access to.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) of the domain to grant access to.
     */

    public void setDomainArn(String domainArn) {
        this.domainArn = domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain to grant access to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the domain to grant access to.
     */

    public String getDomainArn() {
        return this.domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain to grant access to.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) of the domain to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withDomainArn(String domainArn) {
        setDomainArn(domainArn);
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for the endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Options to specify the subnets and security groups for the endpoint.
     */

    public void setVpcOptions(VPCOptions vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for the endpoint.
     * </p>
     * 
     * @return Options to specify the subnets and security groups for the endpoint.
     */

    public VPCOptions getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for the endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Options to specify the subnets and security groups for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withVpcOptions(VPCOptions vpcOptions) {
        setVpcOptions(vpcOptions);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withClientToken(String clientToken) {
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
        if (getDomainArn() != null)
            sb.append("DomainArn: ").append(getDomainArn()).append(",");
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions()).append(",");
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

        if (obj instanceof CreateVpcEndpointRequest == false)
            return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest) obj;
        if (other.getDomainArn() == null ^ this.getDomainArn() == null)
            return false;
        if (other.getDomainArn() != null && other.getDomainArn().equals(this.getDomainArn()) == false)
            return false;
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
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

        hashCode = prime * hashCode + ((getDomainArn() == null) ? 0 : getDomainArn().hashCode());
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointRequest clone() {
        return (CreateVpcEndpointRequest) super.clone();
    }

}
