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
 * Summary information for an Amazon OpenSearch Service-managed VPC endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The current status of the endpoint.
     * </p>
     */
    private String status;

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

    public VpcEndpointSummary withVpcEndpointId(String vpcEndpointId) {
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

    public VpcEndpointSummary withVpcEndpointOwner(String vpcEndpointOwner) {
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

    public VpcEndpointSummary withDomainArn(String domainArn) {
        setDomainArn(domainArn);
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

    public VpcEndpointSummary withStatus(String status) {
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

    public VpcEndpointSummary withStatus(VpcEndpointStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointSummary == false)
            return false;
        VpcEndpointSummary other = (VpcEndpointSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpointSummary clone() {
        try {
            return (VpcEndpointSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.VpcEndpointSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
