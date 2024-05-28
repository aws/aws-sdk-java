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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An OpenSearch Ingestion-managed VPC endpoint that will access one or more pipelines.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/VpcEndpoint" target="_top">AWS API
 *      Documentation</a>
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
     * The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Information about the VPC, including associated subnets and security groups.
     * </p>
     */
    private VpcOptions vpcOptions;

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
     * The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     * </p>
     * 
     * @return The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Information about the VPC, including associated subnets and security groups.
     * </p>
     * 
     * @param vpcOptions
     *        Information about the VPC, including associated subnets and security groups.
     */

    public void setVpcOptions(VpcOptions vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * Information about the VPC, including associated subnets and security groups.
     * </p>
     * 
     * @return Information about the VPC, including associated subnets and security groups.
     */

    public VpcOptions getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * Information about the VPC, including associated subnets and security groups.
     * </p>
     * 
     * @param vpcOptions
     *        Information about the VPC, including associated subnets and security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcOptions(VpcOptions vpcOptions) {
        setVpcOptions(vpcOptions);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions());
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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
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
        com.amazonaws.services.osis.model.transform.VpcEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
