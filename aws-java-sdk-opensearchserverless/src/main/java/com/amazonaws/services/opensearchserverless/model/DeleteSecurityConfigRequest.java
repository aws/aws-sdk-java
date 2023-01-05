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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSecurityConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The security configuration identifier. For SAML the ID will be
     * <code>saml/&lt;accountId&gt;/&lt;idpProviderName&gt;</code>. For example, <code>saml/123456789123/OKTADev</code>.
     * </p>
     */
    private String id;

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

    public DeleteSecurityConfigRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public DeleteSecurityConfigRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSecurityConfigRequest == false)
            return false;
        DeleteSecurityConfigRequest other = (DeleteSecurityConfigRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSecurityConfigRequest clone() {
        return (DeleteSecurityConfigRequest) super.clone();
    }

}
