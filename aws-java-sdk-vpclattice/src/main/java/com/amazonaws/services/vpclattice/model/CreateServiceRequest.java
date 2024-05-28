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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     */
    private String authType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags for the service.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of IAM policy.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an
     *         auth policy is required.
     *         </p>
     *         </li>
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name of the service.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @return The custom domain name of the service.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name of the service.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9,
     *        and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @return The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9,
     *         and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *         hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9,
     *        and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags for the service.
     * </p>
     * 
     * @return The tags for the service.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the service.
     * </p>
     * 
     * @param tags
     *        The tags for the service.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the service.
     * </p>
     * 
     * @param tags
     *        The tags for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateServiceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
