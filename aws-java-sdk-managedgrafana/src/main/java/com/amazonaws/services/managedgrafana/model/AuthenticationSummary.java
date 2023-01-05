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
 * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
 * authentication, and whether that authentication is fully configured.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AuthenticationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     */
    private java.util.List<String> providers;
    /**
     * <p>
     * Specifies whether the workplace's user authentication method is fully configured.
     * </p>
     */
    private String samlConfigurationStatus;

    /**
     * <p>
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     * 
     * @return Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * @see AuthenticationProviderTypes
     */

    public java.util.List<String> getProviders() {
        return providers;
    }

    /**
     * <p>
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     * 
     * @param providers
     *        Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
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
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviders(java.util.Collection)} or {@link #withProviders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providers
     *        Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationSummary withProviders(String... providers) {
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
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     * 
     * @param providers
     *        Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationSummary withProviders(java.util.Collection<String> providers) {
        setProviders(providers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * </p>
     * 
     * @param providers
     *        Specifies whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public AuthenticationSummary withProviders(AuthenticationProviderTypes... providers) {
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
     * Specifies whether the workplace's user authentication method is fully configured.
     * </p>
     * 
     * @param samlConfigurationStatus
     *        Specifies whether the workplace's user authentication method is fully configured.
     * @see SamlConfigurationStatus
     */

    public void setSamlConfigurationStatus(String samlConfigurationStatus) {
        this.samlConfigurationStatus = samlConfigurationStatus;
    }

    /**
     * <p>
     * Specifies whether the workplace's user authentication method is fully configured.
     * </p>
     * 
     * @return Specifies whether the workplace's user authentication method is fully configured.
     * @see SamlConfigurationStatus
     */

    public String getSamlConfigurationStatus() {
        return this.samlConfigurationStatus;
    }

    /**
     * <p>
     * Specifies whether the workplace's user authentication method is fully configured.
     * </p>
     * 
     * @param samlConfigurationStatus
     *        Specifies whether the workplace's user authentication method is fully configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlConfigurationStatus
     */

    public AuthenticationSummary withSamlConfigurationStatus(String samlConfigurationStatus) {
        setSamlConfigurationStatus(samlConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workplace's user authentication method is fully configured.
     * </p>
     * 
     * @param samlConfigurationStatus
     *        Specifies whether the workplace's user authentication method is fully configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlConfigurationStatus
     */

    public AuthenticationSummary withSamlConfigurationStatus(SamlConfigurationStatus samlConfigurationStatus) {
        this.samlConfigurationStatus = samlConfigurationStatus.toString();
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
        if (getProviders() != null)
            sb.append("Providers: ").append(getProviders()).append(",");
        if (getSamlConfigurationStatus() != null)
            sb.append("SamlConfigurationStatus: ").append(getSamlConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationSummary == false)
            return false;
        AuthenticationSummary other = (AuthenticationSummary) obj;
        if (other.getProviders() == null ^ this.getProviders() == null)
            return false;
        if (other.getProviders() != null && other.getProviders().equals(this.getProviders()) == false)
            return false;
        if (other.getSamlConfigurationStatus() == null ^ this.getSamlConfigurationStatus() == null)
            return false;
        if (other.getSamlConfigurationStatus() != null && other.getSamlConfigurationStatus().equals(this.getSamlConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviders() == null) ? 0 : getProviders().hashCode());
        hashCode = prime * hashCode + ((getSamlConfigurationStatus() == null) ? 0 : getSamlConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationSummary clone() {
        try {
            return (AuthenticationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.AuthenticationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
