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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for Proton</a>
     * in the <i>Proton User Guide</i>.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The repository name (for example, <code>myrepos/myrepo</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The repository provider.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for Proton</a>
     * in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *        provider account. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for
     *        Proton</a> in the <i>Proton User Guide</i>.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for Proton</a>
     * in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *         provider account. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for
     *         Proton</a> in the <i>Proton User Guide</i>.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for Proton</a>
     * in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *        provider account. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/setting-up-for-service.html">Setting up for
     *        Proton</a> in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     * </p>
     * 
     * @param encryptionKey
     *        The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     * </p>
     * 
     * @return The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     * </p>
     * 
     * @param encryptionKey
     *        The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The repository name (for example, <code>myrepos/myrepo</code>).
     * </p>
     * 
     * @param name
     *        The repository name (for example, <code>myrepos/myrepo</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The repository name (for example, <code>myrepos/myrepo</code>).
     * </p>
     * 
     * @return The repository name (for example, <code>myrepos/myrepo</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The repository name (for example, <code>myrepos/myrepo</code>).
     * </p>
     * 
     * @param name
     *        The repository name (for example, <code>myrepos/myrepo</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @see RepositoryProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @return The repository provider.
     * @see RepositoryProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public CreateRepositoryRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public CreateRepositoryRequest withProvider(RepositoryProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the Proton repository. A tag is a
     *         key-value pair.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and
     *         tagging</a> in the <i>Proton User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value
     *        pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
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
     * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value
     *        pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(Tag... tags) {
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
     * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value
     *        pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
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

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
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

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryRequest clone() {
        return (CreateRepositoryRequest) super.clone();
    }

}
