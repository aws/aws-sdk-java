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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about the user authentication methods used by the workspace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AuthenticationDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing information about how this workspace works with IAM Identity Center.
     * </p>
     */
    private AwsSsoAuthentication awsSso;
    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     */
    private java.util.List<String> providers;
    /**
     * <p>
     * A structure containing information about how this workspace works with SAML, including what attributes within the
     * assertion are to be mapped to user information in the workspace.
     * </p>
     */
    private SamlAuthentication saml;

    /**
     * <p>
     * A structure containing information about how this workspace works with IAM Identity Center.
     * </p>
     * 
     * @param awsSso
     *        A structure containing information about how this workspace works with IAM Identity Center.
     */

    public void setAwsSso(AwsSsoAuthentication awsSso) {
        this.awsSso = awsSso;
    }

    /**
     * <p>
     * A structure containing information about how this workspace works with IAM Identity Center.
     * </p>
     * 
     * @return A structure containing information about how this workspace works with IAM Identity Center.
     */

    public AwsSsoAuthentication getAwsSso() {
        return this.awsSso;
    }

    /**
     * <p>
     * A structure containing information about how this workspace works with IAM Identity Center.
     * </p>
     * 
     * @param awsSso
     *        A structure containing information about how this workspace works with IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationDescription withAwsSso(AwsSsoAuthentication awsSso) {
        setAwsSso(awsSso);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     * 
     * @return Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to
     *         use the Grafana console in the Amazon Managed Grafana workspace.
     * @see AuthenticationProviderTypes
     */

    public java.util.List<String> getProviders() {
        return providers;
    }

    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param providers
     *        Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to
     *        use the Grafana console in the Amazon Managed Grafana workspace.
     * @see AuthenticationProviderTypes
     */

    public void setProviders(java.util.Collection<String> providers) {
        if (providers == null) {
            this.providers = null;
            return;
        }

        this.providers = new java.util.ArrayList<String>(providers);
    }

    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviders(java.util.Collection)} or {@link #withProviders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providers
     *        Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to
     *        use the Grafana console in the Amazon Managed Grafana workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationDescription withProviders(String... providers) {
        if (this.providers == null) {
            setProviders(new java.util.ArrayList<String>(providers.length));
        }
        for (String ele : providers) {
            this.providers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param providers
     *        Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to
     *        use the Grafana console in the Amazon Managed Grafana workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationDescription withProviders(java.util.Collection<String> providers) {
        setProviders(providers);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to use the
     * Grafana console in the Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param providers
     *        Specifies whether this workspace uses IAM Identity Center, SAML, or both methods to authenticate users to
     *        use the Grafana console in the Amazon Managed Grafana workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationDescription withProviders(AuthenticationProviderTypes... providers) {
        java.util.ArrayList<String> providersCopy = new java.util.ArrayList<String>(providers.length);
        for (AuthenticationProviderTypes value : providers) {
            providersCopy.add(value.toString());
        }
        if (getProviders() == null) {
            setProviders(providersCopy);
        } else {
            getProviders().addAll(providersCopy);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing information about how this workspace works with SAML, including what attributes within the
     * assertion are to be mapped to user information in the workspace.
     * </p>
     * 
     * @param saml
     *        A structure containing information about how this workspace works with SAML, including what attributes
     *        within the assertion are to be mapped to user information in the workspace.
     */

    public void setSaml(SamlAuthentication saml) {
        this.saml = saml;
    }

    /**
     * <p>
     * A structure containing information about how this workspace works with SAML, including what attributes within the
     * assertion are to be mapped to user information in the workspace.
     * </p>
     * 
     * @return A structure containing information about how this workspace works with SAML, including what attributes
     *         within the assertion are to be mapped to user information in the workspace.
     */

    public SamlAuthentication getSaml() {
        return this.saml;
    }

    /**
     * <p>
     * A structure containing information about how this workspace works with SAML, including what attributes within the
     * assertion are to be mapped to user information in the workspace.
     * </p>
     * 
     * @param saml
     *        A structure containing information about how this workspace works with SAML, including what attributes
     *        within the assertion are to be mapped to user information in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationDescription withSaml(SamlAuthentication saml) {
        setSaml(saml);
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
        if (getAwsSso() != null)
            sb.append("AwsSso: ").append(getAwsSso()).append(",");
        if (getProviders() != null)
            sb.append("Providers: ").append(getProviders()).append(",");
        if (getSaml() != null)
            sb.append("Saml: ").append(getSaml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationDescription == false)
            return false;
        AuthenticationDescription other = (AuthenticationDescription) obj;
        if (other.getAwsSso() == null ^ this.getAwsSso() == null)
            return false;
        if (other.getAwsSso() != null && other.getAwsSso().equals(this.getAwsSso()) == false)
            return false;
        if (other.getProviders() == null ^ this.getProviders() == null)
            return false;
        if (other.getProviders() != null && other.getProviders().equals(this.getProviders()) == false)
            return false;
        if (other.getSaml() == null ^ this.getSaml() == null)
            return false;
        if (other.getSaml() != null && other.getSaml().equals(this.getSaml()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsSso() == null) ? 0 : getAwsSso().hashCode());
        hashCode = prime * hashCode + ((getProviders() == null) ? 0 : getProviders().hashCode());
        hashCode = prime * hashCode + ((getSaml() == null) ? 0 : getSaml().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationDescription clone() {
        try {
            return (AuthenticationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.AuthenticationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
