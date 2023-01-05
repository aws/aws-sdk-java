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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connection endpoint for connecting to an Amazon OpenSearch Service domain through a proxy.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The creator of the endpoint.
     * </p>
     */
    private String vpcEndpointOwner;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     * </p>
     */
    private String domainArn;
    /**
     * <p>
     * Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     * </p>
     */
    private VPCDerivedInfo vpcOptions;
    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The connection endpoint ID for connecting to the domain.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @return The unique identifier of the endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The creator of the endpoint.
     * </p>
     * 
     * @param vpcEndpointOwner
     *        The creator of the endpoint.
     */

    public void setVpcEndpointOwner(String vpcEndpointOwner) {
        this.vpcEndpointOwner = vpcEndpointOwner;
    }

    /**
     * <p>
     * The creator of the endpoint.
     * </p>
     * 
     * @return The creator of the endpoint.
     */

    public String getVpcEndpointOwner() {
        return this.vpcEndpointOwner;
    }

    /**
     * <p>
     * The creator of the endpoint.
     * </p>
     * 
     * @param vpcEndpointOwner
     *        The creator of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcEndpointOwner(String vpcEndpointOwner) {
        setVpcEndpointOwner(vpcEndpointOwner);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     */

    public void setDomainArn(String domainArn) {
        this.domainArn = domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     */

    public String getDomainArn() {
        return this.domainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     * </p>
     * 
     * @param domainArn
     *        The Amazon Resource Name (ARN) of the domain associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withDomainArn(String domainArn) {
        setDomainArn(domainArn);
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     */

    public void setVpcOptions(VPCDerivedInfo vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     * </p>
     * 
     * @return Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     */

    public VPCDerivedInfo getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcOptions(VPCDerivedInfo vpcOptions) {
        setVpcOptions(vpcOptions);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @see VpcEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @return The current status of the endpoint.
     * @see VpcEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public VpcEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public VpcEndpoint withStatus(VpcEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The connection endpoint ID for connecting to the domain.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint ID for connecting to the domain.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint ID for connecting to the domain.
     * </p>
     * 
     * @return The connection endpoint ID for connecting to the domain.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The connection endpoint ID for connecting to the domain.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint ID for connecting to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcEndpointOwner() != null)
            sb.append("VpcEndpointOwner: ").append(getVpcEndpointOwner()).append(",");
        if (getDomainArn() != null)
            sb.append("DomainArn: ").append(getDomainArn()).append(",");
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpoint == false)
            return false;
        VpcEndpoint other = (VpcEndpoint) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcEndpointOwner() == null ^ this.getVpcEndpointOwner() == null)
            return false;
        if (other.getVpcEndpointOwner() != null && other.getVpcEndpointOwner().equals(this.getVpcEndpointOwner()) == false)
            return false;
        if (other.getDomainArn() == null ^ this.getDomainArn() == null)
            return false;
        if (other.getDomainArn() != null && other.getDomainArn().equals(this.getDomainArn()) == false)
            return false;
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointOwner() == null) ? 0 : getVpcEndpointOwner().hashCode());
        hashCode = prime * hashCode + ((getDomainArn() == null) ? 0 : getDomainArn().hashCode());
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpoint clone() {
        try {
            return (VpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.VpcEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
