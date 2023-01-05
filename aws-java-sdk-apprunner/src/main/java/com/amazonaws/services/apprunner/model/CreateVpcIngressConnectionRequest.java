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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateVpcIngressConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcIngressConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection
     * resource.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections
     * in your Amazon Web Services account in the Amazon Web Services Region.
     * </p>
     */
    private String vpcIngressConnectionName;
    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to create the VPC Ingress Connection resource.
     * </p>
     */
    private IngressVpcConfiguration ingressVpcConfiguration;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a
     * key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection
     * resource.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress
     *        Connection resource.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection
     * resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress
     *         Connection resource.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection
     * resource.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress
     *        Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcIngressConnectionRequest withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections
     * in your Amazon Web Services account in the Amazon Web Services Region.
     * </p>
     * 
     * @param vpcIngressConnectionName
     *        A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress
     *        Connections in your Amazon Web Services account in the Amazon Web Services Region.
     */

    public void setVpcIngressConnectionName(String vpcIngressConnectionName) {
        this.vpcIngressConnectionName = vpcIngressConnectionName;
    }

    /**
     * <p>
     * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections
     * in your Amazon Web Services account in the Amazon Web Services Region.
     * </p>
     * 
     * @return A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress
     *         Connections in your Amazon Web Services account in the Amazon Web Services Region.
     */

    public String getVpcIngressConnectionName() {
        return this.vpcIngressConnectionName;
    }

    /**
     * <p>
     * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections
     * in your Amazon Web Services account in the Amazon Web Services Region.
     * </p>
     * 
     * @param vpcIngressConnectionName
     *        A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress
     *        Connections in your Amazon Web Services account in the Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcIngressConnectionRequest withVpcIngressConnectionName(String vpcIngressConnectionName) {
        setVpcIngressConnectionName(vpcIngressConnectionName);
        return this;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *        that are used to create the VPC Ingress Connection resource.
     */

    public void setIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        this.ingressVpcConfiguration = ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @return Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *         that are used to create the VPC Ingress Connection resource.
     */

    public IngressVpcConfiguration getIngressVpcConfiguration() {
        return this.ingressVpcConfiguration;
    }

    /**
     * <p>
     * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that
     * are used to create the VPC Ingress Connection resource.
     * </p>
     * 
     * @param ingressVpcConfiguration
     *        Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint
     *        that are used to create the VPC Ingress Connection resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcIngressConnectionRequest withIngressVpcConfiguration(IngressVpcConfiguration ingressVpcConfiguration) {
        setIngressVpcConfiguration(ingressVpcConfiguration);
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag
     *         is a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag
     *        is a key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag
     *        is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcIngressConnectionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag
     *        is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcIngressConnectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVpcIngressConnectionName() != null)
            sb.append("VpcIngressConnectionName: ").append(getVpcIngressConnectionName()).append(",");
        if (getIngressVpcConfiguration() != null)
            sb.append("IngressVpcConfiguration: ").append(getIngressVpcConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcIngressConnectionRequest == false)
            return false;
        CreateVpcIngressConnectionRequest other = (CreateVpcIngressConnectionRequest) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getVpcIngressConnectionName() == null ^ this.getVpcIngressConnectionName() == null)
            return false;
        if (other.getVpcIngressConnectionName() != null && other.getVpcIngressConnectionName().equals(this.getVpcIngressConnectionName()) == false)
            return false;
        if (other.getIngressVpcConfiguration() == null ^ this.getIngressVpcConfiguration() == null)
            return false;
        if (other.getIngressVpcConfiguration() != null && other.getIngressVpcConfiguration().equals(this.getIngressVpcConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getVpcIngressConnectionName() == null) ? 0 : getVpcIngressConnectionName().hashCode());
        hashCode = prime * hashCode + ((getIngressVpcConfiguration() == null) ? 0 : getIngressVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcIngressConnectionRequest clone() {
        return (CreateVpcIngressConnectionRequest) super.clone();
    }

}
