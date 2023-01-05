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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed data of a linked repository—a repository that has been registered with Proton.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Repository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Repository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the linked repository.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * Your customer Amazon Web Services KMS encryption key.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The repository name.
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
     * The Amazon Resource Name (ARN) of the linked repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the linked repository.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the linked repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the linked repository.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the linked repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the linked repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *        provider account.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *         provider account.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository provider
     * account.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of your AWS CodeStar connection that connects Proton to your repository
     *        provider account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * Your customer Amazon Web Services KMS encryption key.
     * </p>
     * 
     * @param encryptionKey
     *        Your customer Amazon Web Services KMS encryption key.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * Your customer Amazon Web Services KMS encryption key.
     * </p>
     * 
     * @return Your customer Amazon Web Services KMS encryption key.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * Your customer Amazon Web Services KMS encryption key.
     * </p>
     * 
     * @param encryptionKey
     *        Your customer Amazon Web Services KMS encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param name
     *        The repository name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @return The repository name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param name
     *        The repository name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withName(String name) {
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

    public Repository withProvider(String provider) {
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

    public Repository withProvider(RepositoryProvider provider) {
        this.provider = provider.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public Repository clone() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.RepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
