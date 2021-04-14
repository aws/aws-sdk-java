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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateHost" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHostRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * </p>
     */
    private String providerEndpoint;
    /**
     * <p>
     * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @param name
     *        The name of the host to be created. The name must be unique in the calling AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @return The name of the host to be created. The name must be unique in the calling AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @param name
     *        The name of the host to be created. The name must be unique in the calling AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @return The name of the installed provider to be associated with your connection. The host resource represents
     *         the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise
     *         Server.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateHostRequest withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateHostRequest withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure to be represented by the host after it is created.
     */

    public void setProviderEndpoint(String providerEndpoint) {
        this.providerEndpoint = providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * </p>
     * 
     * @return The endpoint of the infrastructure to be represented by the host after it is created.
     */

    public String getProviderEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure to be represented by the host after it is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostRequest withProviderEndpoint(String providerEndpoint) {
        setProviderEndpoint(providerEndpoint);
        return this;
    }

    /**
     * <p>
     * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to
     *        be represented by the host must already be connected to the VPC.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @return The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to
     *         be represented by the host must already be connected to the VPC.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to
     *        be represented by the host must already be connected to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderEndpoint() != null)
            sb.append("ProviderEndpoint: ").append(getProviderEndpoint()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
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

        if (obj instanceof CreateHostRequest == false)
            return false;
        CreateHostRequest other = (CreateHostRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getProviderEndpoint() == null ^ this.getProviderEndpoint() == null)
            return false;
        if (other.getProviderEndpoint() != null && other.getProviderEndpoint().equals(this.getProviderEndpoint()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderEndpoint() == null) ? 0 : getProviderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateHostRequest clone() {
        return (CreateHostRequest) super.clone();
    }

}
