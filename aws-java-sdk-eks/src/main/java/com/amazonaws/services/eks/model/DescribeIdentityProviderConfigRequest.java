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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeIdentityProviderConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityProviderConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster name that the identity provider configuration is associated to.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * An object that represents an identity provider configuration.
     * </p>
     */
    private IdentityProviderConfig identityProviderConfig;

    /**
     * <p>
     * The cluster name that the identity provider configuration is associated to.
     * </p>
     * 
     * @param clusterName
     *        The cluster name that the identity provider configuration is associated to.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The cluster name that the identity provider configuration is associated to.
     * </p>
     * 
     * @return The cluster name that the identity provider configuration is associated to.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The cluster name that the identity provider configuration is associated to.
     * </p>
     * 
     * @param clusterName
     *        The cluster name that the identity provider configuration is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityProviderConfigRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * An object that represents an identity provider configuration.
     * </p>
     * 
     * @param identityProviderConfig
     *        An object that represents an identity provider configuration.
     */

    public void setIdentityProviderConfig(IdentityProviderConfig identityProviderConfig) {
        this.identityProviderConfig = identityProviderConfig;
    }

    /**
     * <p>
     * An object that represents an identity provider configuration.
     * </p>
     * 
     * @return An object that represents an identity provider configuration.
     */

    public IdentityProviderConfig getIdentityProviderConfig() {
        return this.identityProviderConfig;
    }

    /**
     * <p>
     * An object that represents an identity provider configuration.
     * </p>
     * 
     * @param identityProviderConfig
     *        An object that represents an identity provider configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityProviderConfigRequest withIdentityProviderConfig(IdentityProviderConfig identityProviderConfig) {
        setIdentityProviderConfig(identityProviderConfig);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getIdentityProviderConfig() != null)
            sb.append("IdentityProviderConfig: ").append(getIdentityProviderConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityProviderConfigRequest == false)
            return false;
        DescribeIdentityProviderConfigRequest other = (DescribeIdentityProviderConfigRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getIdentityProviderConfig() == null ^ this.getIdentityProviderConfig() == null)
            return false;
        if (other.getIdentityProviderConfig() != null && other.getIdentityProviderConfig().equals(this.getIdentityProviderConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderConfig() == null) ? 0 : getIdentityProviderConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityProviderConfigRequest clone() {
        return (DescribeIdentityProviderConfigRequest) super.clone();
    }

}
