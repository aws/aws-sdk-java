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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a list of VPC Ingress Connections based on the filter provided. It can return either <code>ServiceArn</code>
 * or <code>VpcEndpointId</code>, or both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListVpcIngressConnectionsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcIngressConnectionsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a service to filter by.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The ID of a VPC Endpoint to filter by.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a service to filter by.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of a service to filter by.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a service to filter by.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a service to filter by.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a service to filter by.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of a service to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcIngressConnectionsFilter withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC Endpoint to filter by.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of a VPC Endpoint to filter by.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of a VPC Endpoint to filter by.
     * </p>
     * 
     * @return The ID of a VPC Endpoint to filter by.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of a VPC Endpoint to filter by.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of a VPC Endpoint to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcIngressConnectionsFilter withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVpcIngressConnectionsFilter == false)
            return false;
        ListVpcIngressConnectionsFilter other = (ListVpcIngressConnectionsFilter) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcIngressConnectionsFilter clone() {
        try {
            return (ListVpcIngressConnectionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ListVpcIngressConnectionsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
