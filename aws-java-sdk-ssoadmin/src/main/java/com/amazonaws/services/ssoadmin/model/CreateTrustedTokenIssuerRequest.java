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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustedTokenIssuerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer configuration.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Specifies the name of the new trusted token issuer configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies tags to be attached to the new trusted token issuer configuration.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies settings that apply to the new trusted token issuer configuration. The settings that are available
     * depend on what <code>TrustedTokenIssuerType</code> you specify.
     * </p>
     */
    private TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration;
    /**
     * <p>
     * Specifies the type of the new trusted token issuer.
     * </p>
     */
    private String trustedTokenIssuerType;

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This
     *         lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer configuration.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer
     *        configuration.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer configuration.
     * </p>
     * 
     * @return Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer
     *         configuration.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer configuration.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center to contain the new trusted token issuer
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the new trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        Specifies the name of the new trusted token issuer configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the new trusted token issuer configuration.
     * </p>
     * 
     * @return Specifies the name of the new trusted token issuer configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the new trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        Specifies the name of the new trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies tags to be attached to the new trusted token issuer configuration.
     * </p>
     * 
     * @return Specifies tags to be attached to the new trusted token issuer configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies tags to be attached to the new trusted token issuer configuration.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the new trusted token issuer configuration.
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
     * Specifies tags to be attached to the new trusted token issuer configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the new trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies tags to be attached to the new trusted token issuer configuration.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the new trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies settings that apply to the new trusted token issuer configuration. The settings that are available
     * depend on what <code>TrustedTokenIssuerType</code> you specify.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        Specifies settings that apply to the new trusted token issuer configuration. The settings that are
     *        available depend on what <code>TrustedTokenIssuerType</code> you specify.
     */

    public void setTrustedTokenIssuerConfiguration(TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration) {
        this.trustedTokenIssuerConfiguration = trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * Specifies settings that apply to the new trusted token issuer configuration. The settings that are available
     * depend on what <code>TrustedTokenIssuerType</code> you specify.
     * </p>
     * 
     * @return Specifies settings that apply to the new trusted token issuer configuration. The settings that are
     *         available depend on what <code>TrustedTokenIssuerType</code> you specify.
     */

    public TrustedTokenIssuerConfiguration getTrustedTokenIssuerConfiguration() {
        return this.trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * Specifies settings that apply to the new trusted token issuer configuration. The settings that are available
     * depend on what <code>TrustedTokenIssuerType</code> you specify.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        Specifies settings that apply to the new trusted token issuer configuration. The settings that are
     *        available depend on what <code>TrustedTokenIssuerType</code> you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerRequest withTrustedTokenIssuerConfiguration(TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration) {
        setTrustedTokenIssuerConfiguration(trustedTokenIssuerConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the new trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        Specifies the type of the new trusted token issuer.
     * @see TrustedTokenIssuerType
     */

    public void setTrustedTokenIssuerType(String trustedTokenIssuerType) {
        this.trustedTokenIssuerType = trustedTokenIssuerType;
    }

    /**
     * <p>
     * Specifies the type of the new trusted token issuer.
     * </p>
     * 
     * @return Specifies the type of the new trusted token issuer.
     * @see TrustedTokenIssuerType
     */

    public String getTrustedTokenIssuerType() {
        return this.trustedTokenIssuerType;
    }

    /**
     * <p>
     * Specifies the type of the new trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        Specifies the type of the new trusted token issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedTokenIssuerType
     */

    public CreateTrustedTokenIssuerRequest withTrustedTokenIssuerType(String trustedTokenIssuerType) {
        setTrustedTokenIssuerType(trustedTokenIssuerType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the new trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        Specifies the type of the new trusted token issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedTokenIssuerType
     */

    public CreateTrustedTokenIssuerRequest withTrustedTokenIssuerType(TrustedTokenIssuerType trustedTokenIssuerType) {
        this.trustedTokenIssuerType = trustedTokenIssuerType.toString();
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrustedTokenIssuerConfiguration() != null)
            sb.append("TrustedTokenIssuerConfiguration: ").append(getTrustedTokenIssuerConfiguration()).append(",");
        if (getTrustedTokenIssuerType() != null)
            sb.append("TrustedTokenIssuerType: ").append(getTrustedTokenIssuerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrustedTokenIssuerRequest == false)
            return false;
        CreateTrustedTokenIssuerRequest other = (CreateTrustedTokenIssuerRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrustedTokenIssuerConfiguration() == null ^ this.getTrustedTokenIssuerConfiguration() == null)
            return false;
        if (other.getTrustedTokenIssuerConfiguration() != null
                && other.getTrustedTokenIssuerConfiguration().equals(this.getTrustedTokenIssuerConfiguration()) == false)
            return false;
        if (other.getTrustedTokenIssuerType() == null ^ this.getTrustedTokenIssuerType() == null)
            return false;
        if (other.getTrustedTokenIssuerType() != null && other.getTrustedTokenIssuerType().equals(this.getTrustedTokenIssuerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerConfiguration() == null) ? 0 : getTrustedTokenIssuerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerType() == null) ? 0 : getTrustedTokenIssuerType().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustedTokenIssuerRequest clone() {
        return (CreateTrustedTokenIssuerRequest) super.clone();
    }

}
