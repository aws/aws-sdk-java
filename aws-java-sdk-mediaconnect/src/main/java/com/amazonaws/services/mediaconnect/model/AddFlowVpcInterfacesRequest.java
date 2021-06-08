/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A request to add VPC interfaces to the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFlowVpcInterfacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The flow that you want to mutate. */
    private String flowArn;
    /** A list of VPC interfaces that you want to add. */
    private java.util.List<VpcInterfaceRequest> vpcInterfaces;

    /**
     * The flow that you want to mutate.
     * 
     * @param flowArn
     *        The flow that you want to mutate.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to mutate.
     * 
     * @return The flow that you want to mutate.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to mutate.
     * 
     * @param flowArn
     *        The flow that you want to mutate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * A list of VPC interfaces that you want to add.
     * 
     * @return A list of VPC interfaces that you want to add.
     */

    public java.util.List<VpcInterfaceRequest> getVpcInterfaces() {
        return vpcInterfaces;
    }

    /**
     * A list of VPC interfaces that you want to add.
     * 
     * @param vpcInterfaces
     *        A list of VPC interfaces that you want to add.
     */

    public void setVpcInterfaces(java.util.Collection<VpcInterfaceRequest> vpcInterfaces) {
        if (vpcInterfaces == null) {
            this.vpcInterfaces = null;
            return;
        }

        this.vpcInterfaces = new java.util.ArrayList<VpcInterfaceRequest>(vpcInterfaces);
    }

    /**
     * A list of VPC interfaces that you want to add.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcInterfaces(java.util.Collection)} or {@link #withVpcInterfaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcInterfaces
     *        A list of VPC interfaces that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesRequest withVpcInterfaces(VpcInterfaceRequest... vpcInterfaces) {
        if (this.vpcInterfaces == null) {
            setVpcInterfaces(new java.util.ArrayList<VpcInterfaceRequest>(vpcInterfaces.length));
        }
        for (VpcInterfaceRequest ele : vpcInterfaces) {
            this.vpcInterfaces.add(ele);
        }
        return this;
    }

    /**
     * A list of VPC interfaces that you want to add.
     * 
     * @param vpcInterfaces
     *        A list of VPC interfaces that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesRequest withVpcInterfaces(java.util.Collection<VpcInterfaceRequest> vpcInterfaces) {
        setVpcInterfaces(vpcInterfaces);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getVpcInterfaces() != null)
            sb.append("VpcInterfaces: ").append(getVpcInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddFlowVpcInterfacesRequest == false)
            return false;
        AddFlowVpcInterfacesRequest other = (AddFlowVpcInterfacesRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getVpcInterfaces() == null ^ this.getVpcInterfaces() == null)
            return false;
        if (other.getVpcInterfaces() != null && other.getVpcInterfaces().equals(this.getVpcInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaces() == null) ? 0 : getVpcInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public AddFlowVpcInterfacesRequest clone() {
        return (AddFlowVpcInterfacesRequest) super.clone();
    }

}
