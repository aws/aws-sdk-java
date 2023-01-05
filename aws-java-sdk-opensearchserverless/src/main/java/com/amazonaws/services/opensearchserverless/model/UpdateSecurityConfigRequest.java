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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The version of the security configuration to be updated. You can find the most recent version of a security
     * configuration using the <code>GetSecurityPolicy</code> command.
     * </p>
     */
    private String configVersion;
    /**
     * <p>
     * A description of the security configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The security configuration identifier. For SAML the ID will be
     * <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example, <code>saml/123456789123/OKTADev</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * SAML options in in the form of a key-value map.
     * </p>
     */
    private SamlConfigOptions samlOptions;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityConfigRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The version of the security configuration to be updated. You can find the most recent version of a security
     * configuration using the <code>GetSecurityPolicy</code> command.
     * </p>
     * 
     * @param configVersion
     *        The version of the security configuration to be updated. You can find the most recent version of a
     *        security configuration using the <code>GetSecurityPolicy</code> command.
     */

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    /**
     * <p>
     * The version of the security configuration to be updated. You can find the most recent version of a security
     * configuration using the <code>GetSecurityPolicy</code> command.
     * </p>
     * 
     * @return The version of the security configuration to be updated. You can find the most recent version of a
     *         security configuration using the <code>GetSecurityPolicy</code> command.
     */

    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * <p>
     * The version of the security configuration to be updated. You can find the most recent version of a security
     * configuration using the <code>GetSecurityPolicy</code> command.
     * </p>
     * 
     * @param configVersion
     *        The version of the security configuration to be updated. You can find the most recent version of a
     *        security configuration using the <code>GetSecurityPolicy</code> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityConfigRequest withConfigVersion(String configVersion) {
        setConfigVersion(configVersion);
        return this;
    }

    /**
     * <p>
     * A description of the security configuration.
     * </p>
     * 
     * @param description
     *        A description of the security configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the security configuration.
     * </p>
     * 
     * @return A description of the security configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the security configuration.
     * </p>
     * 
     * @param description
     *        A description of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityConfigRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The security configuration identifier. For SAML the ID will be
     * <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example, <code>saml/123456789123/OKTADev</code>.
     * </p>
     * 
     * @param id
     *        The security configuration identifier. For SAML the ID will be
     *        <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example,
     *        <code>saml/123456789123/OKTADev</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The security configuration identifier. For SAML the ID will be
     * <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example, <code>saml/123456789123/OKTADev</code>.
     * </p>
     * 
     * @return The security configuration identifier. For SAML the ID will be
     *         <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example,
     *         <code>saml/123456789123/OKTADev</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The security configuration identifier. For SAML the ID will be
     * <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example, <code>saml/123456789123/OKTADev</code>.
     * </p>
     * 
     * @param id
     *        The security configuration identifier. For SAML the ID will be
     *        <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example,
     *        <code>saml/123456789123/OKTADev</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityConfigRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * SAML options in in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        SAML options in in the form of a key-value map.
     */

    public void setSamlOptions(SamlConfigOptions samlOptions) {
        this.samlOptions = samlOptions;
    }

    /**
     * <p>
     * SAML options in in the form of a key-value map.
     * </p>
     * 
     * @return SAML options in in the form of a key-value map.
     */

    public SamlConfigOptions getSamlOptions() {
        return this.samlOptions;
    }

    /**
     * <p>
     * SAML options in in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        SAML options in in the form of a key-value map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityConfigRequest withSamlOptions(SamlConfigOptions samlOptions) {
        setSamlOptions(samlOptions);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfigVersion() != null)
            sb.append("ConfigVersion: ").append(getConfigVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSamlOptions() != null)
            sb.append("SamlOptions: ").append(getSamlOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityConfigRequest == false)
            return false;
        UpdateSecurityConfigRequest other = (UpdateSecurityConfigRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfigVersion() == null ^ this.getConfigVersion() == null)
            return false;
        if (other.getConfigVersion() != null && other.getConfigVersion().equals(this.getConfigVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSamlOptions() == null ^ this.getSamlOptions() == null)
            return false;
        if (other.getSamlOptions() != null && other.getSamlOptions().equals(this.getSamlOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfigVersion() == null) ? 0 : getConfigVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSamlOptions() == null) ? 0 : getSamlOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityConfigRequest clone() {
        return (UpdateSecurityConfigRequest) super.clone();
    }

}
