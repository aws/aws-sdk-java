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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFlowVpcInterfacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the flow that these VPC interfaces were added to. */
    private String flowArn;
    /** The details of the newly added VPC interfaces. */
    private java.util.List<VpcInterface> vpcInterfaces;

    /**
     * The ARN of the flow that these VPC interfaces were added to.
     * 
     * @param flowArn
     *        The ARN of the flow that these VPC interfaces were added to.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that these VPC interfaces were added to.
     * 
     * @return The ARN of the flow that these VPC interfaces were added to.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that these VPC interfaces were added to.
     * 
     * @param flowArn
     *        The ARN of the flow that these VPC interfaces were added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The details of the newly added VPC interfaces.
     * 
     * @return The details of the newly added VPC interfaces.
     */

    public java.util.List<VpcInterface> getVpcInterfaces() {
        return vpcInterfaces;
    }

    /**
     * The details of the newly added VPC interfaces.
     * 
     * @param vpcInterfaces
     *        The details of the newly added VPC interfaces.
     */

    public void setVpcInterfaces(java.util.Collection<VpcInterface> vpcInterfaces) {
        if (vpcInterfaces == null) {
            this.vpcInterfaces = null;
            return;
        }

        this.vpcInterfaces = new java.util.ArrayList<VpcInterface>(vpcInterfaces);
    }

    /**
     * The details of the newly added VPC interfaces.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcInterfaces(java.util.Collection)} or {@link #withVpcInterfaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcInterfaces
     *        The details of the newly added VPC interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesResult withVpcInterfaces(VpcInterface... vpcInterfaces) {
        if (this.vpcInterfaces == null) {
            setVpcInterfaces(new java.util.ArrayList<VpcInterface>(vpcInterfaces.length));
        }
        for (VpcInterface ele : vpcInterfaces) {
            this.vpcInterfaces.add(ele);
        }
        return this;
    }

    /**
     * The details of the newly added VPC interfaces.
     * 
     * @param vpcInterfaces
     *        The details of the newly added VPC interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowVpcInterfacesResult withVpcInterfaces(java.util.Collection<VpcInterface> vpcInterfaces) {
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

        if (obj instanceof AddFlowVpcInterfacesResult == false)
            return false;
        AddFlowVpcInterfacesResult other = (AddFlowVpcInterfacesResult) obj;
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
    public AddFlowVpcInterfacesResult clone() {
        try {
            return (AddFlowVpcInterfacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
