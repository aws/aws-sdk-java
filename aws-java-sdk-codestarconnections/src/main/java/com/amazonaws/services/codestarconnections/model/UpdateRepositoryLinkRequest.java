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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateRepositoryLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated connection
     * ARN must have the same providerType (such as GitHub) as the original connection ARN for the repo link.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The ID of the repository link to be updated.
     * </p>
     */
    private String repositoryLinkId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated connection
     * ARN must have the same providerType (such as GitHub) as the original connection ARN for the repo link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated
     *        connection ARN must have the same providerType (such as GitHub) as the original connection ARN for the
     *        repo link.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated connection
     * ARN must have the same providerType (such as GitHub) as the original connection ARN for the repo link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated
     *         connection ARN must have the same providerType (such as GitHub) as the original connection ARN for the
     *         repo link.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated connection
     * ARN must have the same providerType (such as GitHub) as the original connection ARN for the repo link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection for the repository link to be updated. The updated
     *        connection ARN must have the same providerType (such as GitHub) as the original connection ARN for the
     *        repo link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryLinkRequest withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of the encryption key for the repository link to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryLinkRequest withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The ID of the repository link to be updated.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link to be updated.
     */

    public void setRepositoryLinkId(String repositoryLinkId) {
        this.repositoryLinkId = repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link to be updated.
     * </p>
     * 
     * @return The ID of the repository link to be updated.
     */

    public String getRepositoryLinkId() {
        return this.repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link to be updated.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryLinkRequest withRepositoryLinkId(String repositoryLinkId) {
        setRepositoryLinkId(repositoryLinkId);
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
        if (getRepositoryLinkId() != null)
            sb.append("RepositoryLinkId: ").append(getRepositoryLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryLinkRequest == false)
            return false;
        UpdateRepositoryLinkRequest other = (UpdateRepositoryLinkRequest) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getRepositoryLinkId() == null ^ this.getRepositoryLinkId() == null)
            return false;
        if (other.getRepositoryLinkId() != null && other.getRepositoryLinkId().equals(this.getRepositoryLinkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryLinkId() == null) ? 0 : getRepositoryLinkId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryLinkRequest clone() {
        return (UpdateRepositoryLinkRequest) super.clone();
    }

}
