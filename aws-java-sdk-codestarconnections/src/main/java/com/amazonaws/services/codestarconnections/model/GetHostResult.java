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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetHost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the requested host.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the requested host.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The provider type of the requested host, such as GitHub Enterprise Server.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The endpoint of the infrastructure represented by the requested host.
     * </p>
     */
    private String providerEndpoint;
    /**
     * <p>
     * The VPC configuration of the requested host.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The name of the requested host.
     * </p>
     * 
     * @param name
     *        The name of the requested host.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the requested host.
     * </p>
     * 
     * @return The name of the requested host.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the requested host.
     * </p>
     * 
     * @param name
     *        The name of the requested host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the requested host.
     * </p>
     * 
     * @param status
     *        The status of the requested host.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the requested host.
     * </p>
     * 
     * @return The status of the requested host.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the requested host.
     * </p>
     * 
     * @param status
     *        The status of the requested host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The provider type of the requested host, such as GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The provider type of the requested host, such as GitHub Enterprise Server.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type of the requested host, such as GitHub Enterprise Server.
     * </p>
     * 
     * @return The provider type of the requested host, such as GitHub Enterprise Server.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type of the requested host, such as GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The provider type of the requested host, such as GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public GetHostResult withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type of the requested host, such as GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The provider type of the requested host, such as GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public GetHostResult withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of the infrastructure represented by the requested host.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure represented by the requested host.
     */

    public void setProviderEndpoint(String providerEndpoint) {
        this.providerEndpoint = providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure represented by the requested host.
     * </p>
     * 
     * @return The endpoint of the infrastructure represented by the requested host.
     */

    public String getProviderEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure represented by the requested host.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure represented by the requested host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostResult withProviderEndpoint(String providerEndpoint) {
        setProviderEndpoint(providerEndpoint);
        return this;
    }

    /**
     * <p>
     * The VPC configuration of the requested host.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration of the requested host.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration of the requested host.
     * </p>
     * 
     * @return The VPC configuration of the requested host.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration of the requested host.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration of the requested host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostResult withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderEndpoint() != null)
            sb.append("ProviderEndpoint: ").append(getProviderEndpoint()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostResult == false)
            return false;
        GetHostResult other = (GetHostResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderEndpoint() == null) ? 0 : getProviderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetHostResult clone() {
        try {
            return (GetHostResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
