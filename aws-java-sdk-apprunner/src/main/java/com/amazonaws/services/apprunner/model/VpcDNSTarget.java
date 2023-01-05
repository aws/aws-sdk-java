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
 * DNS Target record for a custom domain of this Amazon VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/VpcDNSTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcDNSTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     * </p>
     */
    private String vpcIngressConnectionArn;
    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The domain name of your target DNS that is associated with the Amazon VPC.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     */

    public void setVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        this.vpcIngressConnectionArn = vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     */

    public String getVpcIngressConnectionArn() {
        return this.vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDNSTarget withVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        setVpcIngressConnectionArn(vpcIngressConnectionArn);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     * </p>
     * 
     * @return The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDNSTarget withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The domain name of your target DNS that is associated with the Amazon VPC.
     * </p>
     * 
     * @param domainName
     *        The domain name of your target DNS that is associated with the Amazon VPC.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of your target DNS that is associated with the Amazon VPC.
     * </p>
     * 
     * @return The domain name of your target DNS that is associated with the Amazon VPC.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of your target DNS that is associated with the Amazon VPC.
     * </p>
     * 
     * @param domainName
     *        The domain name of your target DNS that is associated with the Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcDNSTarget withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcDNSTarget == false)
            return false;
        VpcDNSTarget other = (VpcDNSTarget) obj;
        if (other.getVpcIngressConnectionArn() == null ^ this.getVpcIngressConnectionArn() == null)
            return false;
        if (other.getVpcIngressConnectionArn() != null && other.getVpcIngressConnectionArn().equals(this.getVpcIngressConnectionArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcIngressConnectionArn() == null) ? 0 : getVpcIngressConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public VpcDNSTarget clone() {
        try {
            return (VpcDNSTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.VpcDNSTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
