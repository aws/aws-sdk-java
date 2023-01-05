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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The VPC endpoint object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS address of the VPC endpoint.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The port that Amazon Redshift Serverless listens on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * An array of <code>VpcEndpoint</code> objects.
     * </p>
     */
    private java.util.List<VpcEndpoint> vpcEndpoints;

    /**
     * <p>
     * The DNS address of the VPC endpoint.
     * </p>
     * 
     * @param address
     *        The DNS address of the VPC endpoint.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The DNS address of the VPC endpoint.
     * </p>
     * 
     * @return The DNS address of the VPC endpoint.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The DNS address of the VPC endpoint.
     * </p>
     * 
     * @param address
     *        The DNS address of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The port that Amazon Redshift Serverless listens on.
     * </p>
     * 
     * @param port
     *        The port that Amazon Redshift Serverless listens on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that Amazon Redshift Serverless listens on.
     * </p>
     * 
     * @return The port that Amazon Redshift Serverless listens on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that Amazon Redshift Serverless listens on.
     * </p>
     * 
     * @param port
     *        The port that Amazon Redshift Serverless listens on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * An array of <code>VpcEndpoint</code> objects.
     * </p>
     * 
     * @return An array of <code>VpcEndpoint</code> objects.
     */

    public java.util.List<VpcEndpoint> getVpcEndpoints() {
        return vpcEndpoints;
    }

    /**
     * <p>
     * An array of <code>VpcEndpoint</code> objects.
     * </p>
     * 
     * @param vpcEndpoints
     *        An array of <code>VpcEndpoint</code> objects.
     */

    public void setVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        if (vpcEndpoints == null) {
            this.vpcEndpoints = null;
            return;
        }

        this.vpcEndpoints = new java.util.ArrayList<VpcEndpoint>(vpcEndpoints);
    }

    /**
     * <p>
     * An array of <code>VpcEndpoint</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpoints(java.util.Collection)} or {@link #withVpcEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcEndpoints
     *        An array of <code>VpcEndpoint</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withVpcEndpoints(VpcEndpoint... vpcEndpoints) {
        if (this.vpcEndpoints == null) {
            setVpcEndpoints(new java.util.ArrayList<VpcEndpoint>(vpcEndpoints.length));
        }
        for (VpcEndpoint ele : vpcEndpoints) {
            this.vpcEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>VpcEndpoint</code> objects.
     * </p>
     * 
     * @param vpcEndpoints
     *        An array of <code>VpcEndpoint</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        setVpcEndpoints(vpcEndpoints);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcEndpoints() != null)
            sb.append("VpcEndpoints: ").append(getVpcEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcEndpoints() == null ^ this.getVpcEndpoints() == null)
            return false;
        if (other.getVpcEndpoints() != null && other.getVpcEndpoints().equals(this.getVpcEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoints() == null) ? 0 : getVpcEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
