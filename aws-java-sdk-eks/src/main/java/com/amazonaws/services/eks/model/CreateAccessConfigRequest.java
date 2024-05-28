/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The access configuration information for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAccessConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during cluster
     * creation time. The default value is <code>true</code>.
     * </p>
     */
    private Boolean bootstrapClusterCreatorAdminPermissions;
    /**
     * <p>
     * The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     * Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by using the
     * Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * </p>
     */
    private String authenticationMode;

    /**
     * <p>
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during cluster
     * creation time. The default value is <code>true</code>.
     * </p>
     * 
     * @param bootstrapClusterCreatorAdminPermissions
     *        Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during
     *        cluster creation time. The default value is <code>true</code>.
     */

    public void setBootstrapClusterCreatorAdminPermissions(Boolean bootstrapClusterCreatorAdminPermissions) {
        this.bootstrapClusterCreatorAdminPermissions = bootstrapClusterCreatorAdminPermissions;
    }

    /**
     * <p>
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during cluster
     * creation time. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during
     *         cluster creation time. The default value is <code>true</code>.
     */

    public Boolean getBootstrapClusterCreatorAdminPermissions() {
        return this.bootstrapClusterCreatorAdminPermissions;
    }

    /**
     * <p>
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during cluster
     * creation time. The default value is <code>true</code>.
     * </p>
     * 
     * @param bootstrapClusterCreatorAdminPermissions
     *        Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during
     *        cluster creation time. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessConfigRequest withBootstrapClusterCreatorAdminPermissions(Boolean bootstrapClusterCreatorAdminPermissions) {
        setBootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during cluster
     * creation time. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether or not the cluster creator IAM principal was set as a cluster admin access entry during
     *         cluster creation time. The default value is <code>true</code>.
     */

    public Boolean isBootstrapClusterCreatorAdminPermissions() {
        return this.bootstrapClusterCreatorAdminPermissions;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     * Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by using the
     * Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     *        Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by
     *        using the Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * @see AuthenticationMode
     */

    public void setAuthenticationMode(String authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     * Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by using the
     * Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * </p>
     * 
     * @return The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     *         Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by
     *         using the Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * @see AuthenticationMode
     */

    public String getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     * Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by using the
     * Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     *        Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by
     *        using the Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMode
     */

    public CreateAccessConfigRequest withAuthenticationMode(String authenticationMode) {
        setAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     * Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by using the
     * Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster. If you create a cluster by using the EKS API, Amazon Web
     *        Services SDKs, or CloudFormation, the default is <code>CONFIG_MAP</code>. If you create the cluster by
     *        using the Amazon Web Services Management Console, the default value is <code>API_AND_CONFIG_MAP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMode
     */

    public CreateAccessConfigRequest withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode.toString();
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
        if (getBootstrapClusterCreatorAdminPermissions() != null)
            sb.append("BootstrapClusterCreatorAdminPermissions: ").append(getBootstrapClusterCreatorAdminPermissions()).append(",");
        if (getAuthenticationMode() != null)
            sb.append("AuthenticationMode: ").append(getAuthenticationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessConfigRequest == false)
            return false;
        CreateAccessConfigRequest other = (CreateAccessConfigRequest) obj;
        if (other.getBootstrapClusterCreatorAdminPermissions() == null ^ this.getBootstrapClusterCreatorAdminPermissions() == null)
            return false;
        if (other.getBootstrapClusterCreatorAdminPermissions() != null
                && other.getBootstrapClusterCreatorAdminPermissions().equals(this.getBootstrapClusterCreatorAdminPermissions()) == false)
            return false;
        if (other.getAuthenticationMode() == null ^ this.getAuthenticationMode() == null)
            return false;
        if (other.getAuthenticationMode() != null && other.getAuthenticationMode().equals(this.getAuthenticationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBootstrapClusterCreatorAdminPermissions() == null) ? 0 : getBootstrapClusterCreatorAdminPermissions().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationMode() == null) ? 0 : getAuthenticationMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessConfigRequest clone() {
        try {
            return (CreateAccessConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.CreateAccessConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
