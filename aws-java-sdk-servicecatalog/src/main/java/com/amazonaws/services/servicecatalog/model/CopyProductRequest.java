/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     */
    private String sourceProductArn;
    /**
     * <p>
     * The identifier of the target product. By default, a new product is created.
     * </p>
     */
    private String targetProductId;
    /**
     * <p>
     * A name for the target product. The default is the name of the source product.
     * </p>
     */
    private String targetProductName;
    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all
     * provisioning artifacts are copied.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers;
    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     */
    private java.util.List<String> copyOptions;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * 
     * @param sourceProductArn
     *        The Amazon Resource Name (ARN) of the source product.
     */

    public void setSourceProductArn(String sourceProductArn) {
        this.sourceProductArn = sourceProductArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source product.
     */

    public String getSourceProductArn() {
        return this.sourceProductArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * 
     * @param sourceProductArn
     *        The Amazon Resource Name (ARN) of the source product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withSourceProductArn(String sourceProductArn) {
        setSourceProductArn(sourceProductArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is created.
     * </p>
     * 
     * @param targetProductId
     *        The identifier of the target product. By default, a new product is created.
     */

    public void setTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is created.
     * </p>
     * 
     * @return The identifier of the target product. By default, a new product is created.
     */

    public String getTargetProductId() {
        return this.targetProductId;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is created.
     * </p>
     * 
     * @param targetProductId
     *        The identifier of the target product. By default, a new product is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withTargetProductId(String targetProductId) {
        setTargetProductId(targetProductId);
        return this;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source product.
     * </p>
     * 
     * @param targetProductName
     *        A name for the target product. The default is the name of the source product.
     */

    public void setTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source product.
     * </p>
     * 
     * @return A name for the target product. The default is the name of the source product.
     */

    public String getTargetProductName() {
        return this.targetProductName;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source product.
     * </p>
     * 
     * @param targetProductName
     *        A name for the target product. The default is the name of the source product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withTargetProductName(String targetProductName) {
        setTargetProductName(targetProductName);
        return this;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all
     * provisioning artifacts are copied.
     * </p>
     * 
     * @return The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By
     *         default, all provisioning artifacts are copied.
     */

    public java.util.List<java.util.Map<String, String>> getSourceProvisioningArtifactIdentifiers() {
        return sourceProvisioningArtifactIdentifiers;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all
     * provisioning artifacts are copied.
     * </p>
     * 
     * @param sourceProvisioningArtifactIdentifiers
     *        The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default,
     *        all provisioning artifacts are copied.
     */

    public void setSourceProvisioningArtifactIdentifiers(java.util.Collection<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers) {
        if (sourceProvisioningArtifactIdentifiers == null) {
            this.sourceProvisioningArtifactIdentifiers = null;
            return;
        }

        this.sourceProvisioningArtifactIdentifiers = new java.util.ArrayList<java.util.Map<String, String>>(sourceProvisioningArtifactIdentifiers);
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all
     * provisioning artifacts are copied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceProvisioningArtifactIdentifiers(java.util.Collection)} or
     * {@link #withSourceProvisioningArtifactIdentifiers(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param sourceProvisioningArtifactIdentifiers
     *        The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default,
     *        all provisioning artifacts are copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withSourceProvisioningArtifactIdentifiers(java.util.Map<String, String>... sourceProvisioningArtifactIdentifiers) {
        if (this.sourceProvisioningArtifactIdentifiers == null) {
            setSourceProvisioningArtifactIdentifiers(new java.util.ArrayList<java.util.Map<String, String>>(sourceProvisioningArtifactIdentifiers.length));
        }
        for (java.util.Map<String, String> ele : sourceProvisioningArtifactIdentifiers) {
            this.sourceProvisioningArtifactIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all
     * provisioning artifacts are copied.
     * </p>
     * 
     * @param sourceProvisioningArtifactIdentifiers
     *        The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default,
     *        all provisioning artifacts are copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withSourceProvisioningArtifactIdentifiers(
            java.util.Collection<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers) {
        setSourceProvisioningArtifactIdentifiers(sourceProvisioningArtifactIdentifiers);
        return this;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     * 
     * @return The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to
     *         the target product.
     * @see CopyOption
     */

    public java.util.List<String> getCopyOptions() {
        return copyOptions;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     * 
     * @param copyOptions
     *        The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to
     *        the target product.
     * @see CopyOption
     */

    public void setCopyOptions(java.util.Collection<String> copyOptions) {
        if (copyOptions == null) {
            this.copyOptions = null;
            return;
        }

        this.copyOptions = new java.util.ArrayList<String>(copyOptions);
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCopyOptions(java.util.Collection)} or {@link #withCopyOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param copyOptions
     *        The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to
     *        the target product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyOption
     */

    public CopyProductRequest withCopyOptions(String... copyOptions) {
        if (this.copyOptions == null) {
            setCopyOptions(new java.util.ArrayList<String>(copyOptions.length));
        }
        for (String ele : copyOptions) {
            this.copyOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     * 
     * @param copyOptions
     *        The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to
     *        the target product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyOption
     */

    public CopyProductRequest withCopyOptions(java.util.Collection<String> copyOptions) {
        setCopyOptions(copyOptions);
        return this;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to the
     * target product.
     * </p>
     * 
     * @param copyOptions
     *        The copy options. If the value is <code>CopyTags</code>, the tags from the source product are copied to
     *        the target product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyOption
     */

    public CopyProductRequest withCopyOptions(CopyOption... copyOptions) {
        java.util.ArrayList<String> copyOptionsCopy = new java.util.ArrayList<String>(copyOptions.length);
        for (CopyOption value : copyOptions) {
            copyOptionsCopy.add(value.toString());
        }
        if (getCopyOptions() == null) {
            setCopyOptions(copyOptionsCopy);
        } else {
            getCopyOptions().addAll(copyOptionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProductRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getSourceProductArn() != null)
            sb.append("SourceProductArn: ").append(getSourceProductArn()).append(",");
        if (getTargetProductId() != null)
            sb.append("TargetProductId: ").append(getTargetProductId()).append(",");
        if (getTargetProductName() != null)
            sb.append("TargetProductName: ").append(getTargetProductName()).append(",");
        if (getSourceProvisioningArtifactIdentifiers() != null)
            sb.append("SourceProvisioningArtifactIdentifiers: ").append(getSourceProvisioningArtifactIdentifiers()).append(",");
        if (getCopyOptions() != null)
            sb.append("CopyOptions: ").append(getCopyOptions()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProductRequest == false)
            return false;
        CopyProductRequest other = (CopyProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getSourceProductArn() == null ^ this.getSourceProductArn() == null)
            return false;
        if (other.getSourceProductArn() != null && other.getSourceProductArn().equals(this.getSourceProductArn()) == false)
            return false;
        if (other.getTargetProductId() == null ^ this.getTargetProductId() == null)
            return false;
        if (other.getTargetProductId() != null && other.getTargetProductId().equals(this.getTargetProductId()) == false)
            return false;
        if (other.getTargetProductName() == null ^ this.getTargetProductName() == null)
            return false;
        if (other.getTargetProductName() != null && other.getTargetProductName().equals(this.getTargetProductName()) == false)
            return false;
        if (other.getSourceProvisioningArtifactIdentifiers() == null ^ this.getSourceProvisioningArtifactIdentifiers() == null)
            return false;
        if (other.getSourceProvisioningArtifactIdentifiers() != null
                && other.getSourceProvisioningArtifactIdentifiers().equals(this.getSourceProvisioningArtifactIdentifiers()) == false)
            return false;
        if (other.getCopyOptions() == null ^ this.getCopyOptions() == null)
            return false;
        if (other.getCopyOptions() != null && other.getCopyOptions().equals(this.getCopyOptions()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getSourceProductArn() == null) ? 0 : getSourceProductArn().hashCode());
        hashCode = prime * hashCode + ((getTargetProductId() == null) ? 0 : getTargetProductId().hashCode());
        hashCode = prime * hashCode + ((getTargetProductName() == null) ? 0 : getTargetProductName().hashCode());
        hashCode = prime * hashCode + ((getSourceProvisioningArtifactIdentifiers() == null) ? 0 : getSourceProvisioningArtifactIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getCopyOptions() == null) ? 0 : getCopyOptions().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CopyProductRequest clone() {
        return (CopyProductRequest) super.clone();
    }

}
