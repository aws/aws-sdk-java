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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateRepositoryLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRepositoryLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The owner ID for the repository associated with a specific sync configuration, such as the owner ID in GitHub.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The name of the repository to be associated with the repository link.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository link.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The tags for the repository to be associated with the repository link.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection to be associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The owner ID for the repository associated with a specific sync configuration, such as the owner ID in GitHub.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the repository associated with a specific sync configuration, such as the owner ID in
     *        GitHub.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The owner ID for the repository associated with a specific sync configuration, such as the owner ID in GitHub.
     * </p>
     * 
     * @return The owner ID for the repository associated with a specific sync configuration, such as the owner ID in
     *         GitHub.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The owner ID for the repository associated with a specific sync configuration, such as the owner ID in GitHub.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the repository associated with a specific sync configuration, such as the owner ID in
     *        GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to be associated with the repository link.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to be associated with the repository link.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to be associated with the repository link.
     * </p>
     * 
     * @return The name of the repository to be associated with the repository link.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to be associated with the repository link.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to be associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository link.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository
     *        link.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository link.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository
     *         link.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository link.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) encryption key for the repository to be associated with the repository
     *        link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The tags for the repository to be associated with the repository link.
     * </p>
     * 
     * @return The tags for the repository to be associated with the repository link.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the repository to be associated with the repository link.
     * </p>
     * 
     * @param tags
     *        The tags for the repository to be associated with the repository link.
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
     * The tags for the repository to be associated with the repository link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the repository to be associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withTags(Tag... tags) {
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
     * The tags for the repository to be associated with the repository link.
     * </p>
     * 
     * @param tags
     *        The tags for the repository to be associated with the repository link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryLinkRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
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

        if (obj instanceof CreateRepositoryLinkRequest == false)
            return false;
        CreateRepositoryLinkRequest other = (CreateRepositoryLinkRequest) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
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
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryLinkRequest clone() {
        return (CreateRepositoryLinkRequest) super.clone();
    }

}
