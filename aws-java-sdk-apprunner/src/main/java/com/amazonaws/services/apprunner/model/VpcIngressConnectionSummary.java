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
 * Provides summary information about an VPC Ingress Connection, which includes its VPC Ingress Connection ARN and its
 * associated Service ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/VpcIngressConnectionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcIngressConnectionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     */
    private String vpcIngressConnectionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     */
    private String serviceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     */

    public void setVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        this.vpcIngressConnectionArn = vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     */

    public String getVpcIngressConnectionArn() {
        return this.vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnectionSummary withVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        setVpcIngressConnectionArn(vpcIngressConnectionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcIngressConnectionSummary withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
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
        if (getVpcIngressConnectionArn() != null)
            sb.append("VpcIngressConnectionArn: ").append(getVpcIngressConnectionArn()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcIngressConnectionSummary == false)
            return false;
        VpcIngressConnectionSummary other = (VpcIngressConnectionSummary) obj;
        if (other.getVpcIngressConnectionArn() == null ^ this.getVpcIngressConnectionArn() == null)
            return false;
        if (other.getVpcIngressConnectionArn() != null && other.getVpcIngressConnectionArn().equals(this.getVpcIngressConnectionArn()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcIngressConnectionArn() == null) ? 0 : getVpcIngressConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        return hashCode;
    }

    @Override
    public VpcIngressConnectionSummary clone() {
        try {
            return (VpcIngressConnectionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.VpcIngressConnectionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
