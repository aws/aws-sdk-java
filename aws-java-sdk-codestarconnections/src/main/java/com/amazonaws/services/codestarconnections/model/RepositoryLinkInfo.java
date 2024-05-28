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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the repository link resource, such as the repository link ARN, the associated connection ARN,
 * encryption key ARN, and owner ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/RepositoryLinkInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryLinkInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository link.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The provider type for the connection, such as GitHub, associated with the repository link.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository link.
     * </p>
     */
    private String repositoryLinkArn;
    /**
     * <p>
     * The ID of the repository link.
     * </p>
     */
    private String repositoryLinkId;
    /**
     * <p>
     * The name of the repository associated with the repository link.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection associated with the repository link.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection associated with the repository link.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection associated with the repository link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository link.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository
     *        link.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository
     *         link.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository link.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of the encryption key for the repository associated with the repository
     *        link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     * </p>
     * 
     * @return The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the repository associated with the repository link, such as the owner ID in GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The provider type for the connection, such as GitHub, associated with the repository link.
     * </p>
     * 
     * @param providerType
     *        The provider type for the connection, such as GitHub, associated with the repository link.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type for the connection, such as GitHub, associated with the repository link.
     * </p>
     * 
     * @return The provider type for the connection, such as GitHub, associated with the repository link.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type for the connection, such as GitHub, associated with the repository link.
     * </p>
     * 
     * @param providerType
     *        The provider type for the connection, such as GitHub, associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryLinkInfo withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type for the connection, such as GitHub, associated with the repository link.
     * </p>
     * 
     * @param providerType
     *        The provider type for the connection, such as GitHub, associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryLinkInfo withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository link.
     * </p>
     * 
     * @param repositoryLinkArn
     *        The Amazon Resource Name (ARN) of the repository link.
     */

    public void setRepositoryLinkArn(String repositoryLinkArn) {
        this.repositoryLinkArn = repositoryLinkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the repository link.
     */

    public String getRepositoryLinkArn() {
        return this.repositoryLinkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository link.
     * </p>
     * 
     * @param repositoryLinkArn
     *        The Amazon Resource Name (ARN) of the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withRepositoryLinkArn(String repositoryLinkArn) {
        setRepositoryLinkArn(repositoryLinkArn);
        return this;
    }

    /**
     * <p>
     * The ID of the repository link.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link.
     */

    public void setRepositoryLinkId(String repositoryLinkId) {
        this.repositoryLinkId = repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link.
     * </p>
     * 
     * @return The ID of the repository link.
     */

    public String getRepositoryLinkId() {
        return this.repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withRepositoryLinkId(String repositoryLinkId) {
        setRepositoryLinkId(repositoryLinkId);
        return this;
    }

    /**
     * <p>
     * The name of the repository associated with the repository link.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository associated with the repository link.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository associated with the repository link.
     * </p>
     * 
     * @return The name of the repository associated with the repository link.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository associated with the repository link.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryLinkInfo withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getRepositoryLinkArn() != null)
            sb.append("RepositoryLinkArn: ").append(getRepositoryLinkArn()).append(",");
        if (getRepositoryLinkId() != null)
            sb.append("RepositoryLinkId: ").append(getRepositoryLinkId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryLinkInfo == false)
            return false;
        RepositoryLinkInfo other = (RepositoryLinkInfo) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getRepositoryLinkArn() == null ^ this.getRepositoryLinkArn() == null)
            return false;
        if (other.getRepositoryLinkArn() != null && other.getRepositoryLinkArn().equals(this.getRepositoryLinkArn()) == false)
            return false;
        if (other.getRepositoryLinkId() == null ^ this.getRepositoryLinkId() == null)
            return false;
        if (other.getRepositoryLinkId() != null && other.getRepositoryLinkId().equals(this.getRepositoryLinkId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getRepositoryLinkArn() == null) ? 0 : getRepositoryLinkArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryLinkId() == null) ? 0 : getRepositoryLinkId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryLinkInfo clone() {
        try {
            return (RepositoryLinkInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarconnections.model.transform.RepositoryLinkInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
