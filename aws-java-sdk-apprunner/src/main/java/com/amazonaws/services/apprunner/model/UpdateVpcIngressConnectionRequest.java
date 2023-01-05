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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateVpcIngressConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcIngressConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     * </p>
     */
    private String vpcIngressConnectionArn;
    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to update the VPC Ingress Connection resource.
     * </p>
     */
    private IngressVpcConfiguration ingressVpcConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     */

    public void setVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        this.vpcIngressConnectionArn = vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to
     *         update.
     */

    public String getVpcIngressConnectionArn() {
        return this.vpcIngressConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     * </p>
     * 
     * @param vpcIngressConnectionArn
     *        The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcIngressConnectionRequest withVpcIngressConnectionArn(String vpcIngressConnectionArn) {
        setVpcIngressConnectionArn(vpcIngressConnectionArn);
        return this;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to update the VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *        that are used to update the VPC Ingress Connection resource.
     */

    public void setIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        this.ingressVpcConfiguration = ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to update the VPC Ingress Connection resource.
     * </p>
     * 
     * @return Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *         that are used to update the VPC Ingress Connection resource.
     */

    public IngressVpcConfiguration getIngressVpcConfiguration() {
        return this.ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to update the VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *        that are used to update the VPC Ingress Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcIngressConnectionRequest withIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        setIngressVpcConfiguration(ingressVpcConfiguration);
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
        if (getIngressVpcConfiguration() != null)
            sb.append("IngressVpcConfiguration: ").append(getIngressVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcIngressConnectionRequest == false)
            return false;
        UpdateVpcIngressConnectionRequest other = (UpdateVpcIngressConnectionRequest) obj;
        if (other.getVpcIngressConnectionArn() == null ^ this.getVpcIngressConnectionArn() == null)
            return false;
        if (other.getVpcIngressConnectionArn() != null && other.getVpcIngressConnectionArn().equals(this.getVpcIngressConnectionArn()) == false)
            return false;
        if (other.getIngressVpcConfiguration() == null ^ this.getIngressVpcConfiguration() == null)
            return false;
        if (other.getIngressVpcConfiguration() != null && other.getIngressVpcConfiguration().equals(this.getIngressVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcIngressConnectionArn() == null) ? 0 : getVpcIngressConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getIngressVpcConfiguration() == null) ? 0 : getIngressVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcIngressConnectionRequest clone() {
        return (UpdateVpcIngressConnectionRequest) super.clone();
    }

}
