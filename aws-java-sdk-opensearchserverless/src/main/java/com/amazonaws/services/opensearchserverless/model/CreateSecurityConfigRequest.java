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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description of the security configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the security configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes SAML options in in the form of a key-value map.
     * </p>
     */
    private SamlConfigOptions samlOptions;
    /**
     * <p>
     * The type of security configuration.
     * </p>
     */
    private String type;

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

    public CreateSecurityConfigRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateSecurityConfigRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @return The name of the security configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes SAML options in in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        Describes SAML options in in the form of a key-value map.
     */

    public void setSamlOptions(SamlConfigOptions samlOptions) {
        this.samlOptions = samlOptions;
    }

    /**
     * <p>
     * Describes SAML options in in the form of a key-value map.
     * </p>
     * 
     * @return Describes SAML options in in the form of a key-value map.
     */

    public SamlConfigOptions getSamlOptions() {
        return this.samlOptions;
    }

    /**
     * <p>
     * Describes SAML options in in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        Describes SAML options in in the form of a key-value map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigRequest withSamlOptions(SamlConfigOptions samlOptions) {
        setSamlOptions(samlOptions);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @see SecurityConfigType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @return The type of security configuration.
     * @see SecurityConfigType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public CreateSecurityConfigRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public CreateSecurityConfigRequest withType(SecurityConfigType type) {
        this.type = type.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSamlOptions() != null)
            sb.append("SamlOptions: ").append(getSamlOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityConfigRequest == false)
            return false;
        CreateSecurityConfigRequest other = (CreateSecurityConfigRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSamlOptions() == null ^ this.getSamlOptions() == null)
            return false;
        if (other.getSamlOptions() != null && other.getSamlOptions().equals(this.getSamlOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSamlOptions() == null) ? 0 : getSamlOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityConfigRequest clone() {
        return (CreateSecurityConfigRequest) super.clone();
    }

}
