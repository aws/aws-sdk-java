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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response parameters to the <code><a>DescribeVpcEndpoints</a></code> operation. Returns a list
 * containing configuration details and status of the VPC Endpoints as well as a list containing error responses of the
 * endpoints that could not be described
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about each requested VPC endpoint.
     * </p>
     */
    private java.util.List<VpcEndpoint> vpcEndpoints;
    /**
     * <p>
     * Any errors associated with the request.
     * </p>
     */
    private java.util.List<VpcEndpointError> vpcEndpointErrors;

    /**
     * <p>
     * Information about each requested VPC endpoint.
     * </p>
     * 
     * @return Information about each requested VPC endpoint.
     */

    public java.util.List<VpcEndpoint> getVpcEndpoints() {
        return vpcEndpoints;
    }

    /**
     * <p>
     * Information about each requested VPC endpoint.
     * </p>
     * 
     * @param vpcEndpoints
     *        Information about each requested VPC endpoint.
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
     * Information about each requested VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpoints(java.util.Collection)} or {@link #withVpcEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcEndpoints
     *        Information about each requested VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsResult withVpcEndpoints(VpcEndpoint... vpcEndpoints) {
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
     * Information about each requested VPC endpoint.
     * </p>
     * 
     * @param vpcEndpoints
     *        Information about each requested VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsResult withVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        setVpcEndpoints(vpcEndpoints);
        return this;
    }

    /**
     * <p>
     * Any errors associated with the request.
     * </p>
     * 
     * @return Any errors associated with the request.
     */

    public java.util.List<VpcEndpointError> getVpcEndpointErrors() {
        return vpcEndpointErrors;
    }

    /**
     * <p>
     * Any errors associated with the request.
     * </p>
     * 
     * @param vpcEndpointErrors
     *        Any errors associated with the request.
     */

    public void setVpcEndpointErrors(java.util.Collection<VpcEndpointError> vpcEndpointErrors) {
        if (vpcEndpointErrors == null) {
            this.vpcEndpointErrors = null;
            return;
        }

        this.vpcEndpointErrors = new java.util.ArrayList<VpcEndpointError>(vpcEndpointErrors);
    }

    /**
     * <p>
     * Any errors associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointErrors(java.util.Collection)} or {@link #withVpcEndpointErrors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointErrors
     *        Any errors associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsResult withVpcEndpointErrors(VpcEndpointError... vpcEndpointErrors) {
        if (this.vpcEndpointErrors == null) {
            setVpcEndpointErrors(new java.util.ArrayList<VpcEndpointError>(vpcEndpointErrors.length));
        }
        for (VpcEndpointError ele : vpcEndpointErrors) {
            this.vpcEndpointErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any errors associated with the request.
     * </p>
     * 
     * @param vpcEndpointErrors
     *        Any errors associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsResult withVpcEndpointErrors(java.util.Collection<VpcEndpointError> vpcEndpointErrors) {
        setVpcEndpointErrors(vpcEndpointErrors);
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
        if (getVpcEndpoints() != null)
            sb.append("VpcEndpoints: ").append(getVpcEndpoints()).append(",");
        if (getVpcEndpointErrors() != null)
            sb.append("VpcEndpointErrors: ").append(getVpcEndpointErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointsResult == false)
            return false;
        DescribeVpcEndpointsResult other = (DescribeVpcEndpointsResult) obj;
        if (other.getVpcEndpoints() == null ^ this.getVpcEndpoints() == null)
            return false;
        if (other.getVpcEndpoints() != null && other.getVpcEndpoints().equals(this.getVpcEndpoints()) == false)
            return false;
        if (other.getVpcEndpointErrors() == null ^ this.getVpcEndpointErrors() == null)
            return false;
        if (other.getVpcEndpointErrors() != null && other.getVpcEndpointErrors().equals(this.getVpcEndpointErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpoints() == null) ? 0 : getVpcEndpoints().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointErrors() == null) ? 0 : getVpcEndpointErrors().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointsResult clone() {
        try {
            return (DescribeVpcEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
