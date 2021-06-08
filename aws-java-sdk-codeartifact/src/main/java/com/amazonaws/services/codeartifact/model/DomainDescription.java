/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a domain. A domain is a container for repositories. When you create a domain, it is empty until you
 * add one or more repositories.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DomainDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     */
    private Integer repositoryCount;
    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     */
    private Long assetSizeBytes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     * </p>
     */
    private String s3BucketArn;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * 
     * @param owner
     *        The AWS account ID that owns the domain.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * 
     * @return The AWS account ID that owns the domain.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The AWS account ID that owns the domain.
     * </p>
     * 
     * @param owner
     *        The AWS account ID that owns the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of a domain. The valid values are </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @see DomainStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of a domain. The valid values are </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleted</code>
     *         </p>
     *         </li>
     * @see DomainStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of a domain. The valid values are </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of a domain. The valid values are
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of a domain. The valid values are </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainDescription withStatus(DomainStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that represents the date and time the domain was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     * 
     * @return A timestamp that represents the date and time the domain was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the domain was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that represents the date and time the domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * </p>
     * 
     * @param encryptionKey
     *        The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * </p>
     * 
     * @return The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * </p>
     * 
     * @param encryptionKey
     *        The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     * 
     * @param repositoryCount
     *        The number of repositories in the domain.
     */

    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     * 
     * @return The number of repositories in the domain.
     */

    public Integer getRepositoryCount() {
        return this.repositoryCount;
    }

    /**
     * <p>
     * The number of repositories in the domain.
     * </p>
     * 
     * @param repositoryCount
     *        The number of repositories in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withRepositoryCount(Integer repositoryCount) {
        setRepositoryCount(repositoryCount);
        return this;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     * 
     * @param assetSizeBytes
     *        The total size of all assets in the domain.
     */

    public void setAssetSizeBytes(Long assetSizeBytes) {
        this.assetSizeBytes = assetSizeBytes;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     * 
     * @return The total size of all assets in the domain.
     */

    public Long getAssetSizeBytes() {
        return this.assetSizeBytes;
    }

    /**
     * <p>
     * The total size of all assets in the domain.
     * </p>
     * 
     * @param assetSizeBytes
     *        The total size of all assets in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withAssetSizeBytes(Long assetSizeBytes) {
        setAssetSizeBytes(assetSizeBytes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the
     *         domain.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescription withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getRepositoryCount() != null)
            sb.append("RepositoryCount: ").append(getRepositoryCount()).append(",");
        if (getAssetSizeBytes() != null)
            sb.append("AssetSizeBytes: ").append(getAssetSizeBytes()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDescription == false)
            return false;
        DomainDescription other = (DomainDescription) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getRepositoryCount() == null ^ this.getRepositoryCount() == null)
            return false;
        if (other.getRepositoryCount() != null && other.getRepositoryCount().equals(this.getRepositoryCount()) == false)
            return false;
        if (other.getAssetSizeBytes() == null ^ this.getAssetSizeBytes() == null)
            return false;
        if (other.getAssetSizeBytes() != null && other.getAssetSizeBytes().equals(this.getAssetSizeBytes()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getRepositoryCount() == null) ? 0 : getRepositoryCount().hashCode());
        hashCode = prime * hashCode + ((getAssetSizeBytes() == null) ? 0 : getAssetSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        return hashCode;
    }

    @Override
    public DomainDescription clone() {
        try {
            return (DomainDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.DomainDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
