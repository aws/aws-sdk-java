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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReferenceMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The reference's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the reference was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The reference's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The reference's files.
     * </p>
     */
    private ReferenceFiles files;
    /**
     * <p>
     * The reference's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The reference's MD5 checksum.
     * </p>
     */
    private String md5;
    /**
     * <p>
     * The reference's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reference's reference store ID.
     * </p>
     */
    private String referenceStoreId;
    /**
     * <p>
     * The reference's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the reference was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @param arn
     *        The reference's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @return The reference's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @param arn
     *        The reference's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the reference was created.
     * </p>
     * 
     * @param creationTime
     *        When the reference was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the reference was created.
     * </p>
     * 
     * @return When the reference was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the reference was created.
     * </p>
     * 
     * @param creationTime
     *        When the reference was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The reference's description.
     * </p>
     * 
     * @param description
     *        The reference's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The reference's description.
     * </p>
     * 
     * @return The reference's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The reference's description.
     * </p>
     * 
     * @param description
     *        The reference's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The reference's files.
     * </p>
     * 
     * @param files
     *        The reference's files.
     */

    public void setFiles(ReferenceFiles files) {
        this.files = files;
    }

    /**
     * <p>
     * The reference's files.
     * </p>
     * 
     * @return The reference's files.
     */

    public ReferenceFiles getFiles() {
        return this.files;
    }

    /**
     * <p>
     * The reference's files.
     * </p>
     * 
     * @param files
     *        The reference's files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withFiles(ReferenceFiles files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The reference's ID.
     * </p>
     * 
     * @param id
     *        The reference's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The reference's ID.
     * </p>
     * 
     * @return The reference's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The reference's ID.
     * </p>
     * 
     * @param id
     *        The reference's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The reference's MD5 checksum.
     * </p>
     * 
     * @param md5
     *        The reference's MD5 checksum.
     */

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * <p>
     * The reference's MD5 checksum.
     * </p>
     * 
     * @return The reference's MD5 checksum.
     */

    public String getMd5() {
        return this.md5;
    }

    /**
     * <p>
     * The reference's MD5 checksum.
     * </p>
     * 
     * @param md5
     *        The reference's MD5 checksum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withMd5(String md5) {
        setMd5(md5);
        return this;
    }

    /**
     * <p>
     * The reference's name.
     * </p>
     * 
     * @param name
     *        The reference's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The reference's name.
     * </p>
     * 
     * @return The reference's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The reference's name.
     * </p>
     * 
     * @param name
     *        The reference's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The reference's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The reference's reference store ID.
     */

    public void setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    /**
     * <p>
     * The reference's reference store ID.
     * </p>
     * 
     * @return The reference's reference store ID.
     */

    public String getReferenceStoreId() {
        return this.referenceStoreId;
    }

    /**
     * <p>
     * The reference's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The reference's reference store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withReferenceStoreId(String referenceStoreId) {
        setReferenceStoreId(referenceStoreId);
        return this;
    }

    /**
     * <p>
     * The reference's status.
     * </p>
     * 
     * @param status
     *        The reference's status.
     * @see ReferenceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The reference's status.
     * </p>
     * 
     * @return The reference's status.
     * @see ReferenceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The reference's status.
     * </p>
     * 
     * @param status
     *        The reference's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceStatus
     */

    public GetReferenceMetadataResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The reference's status.
     * </p>
     * 
     * @param status
     *        The reference's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceStatus
     */

    public GetReferenceMetadataResult withStatus(ReferenceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the reference was updated.
     * </p>
     * 
     * @param updateTime
     *        When the reference was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * When the reference was updated.
     * </p>
     * 
     * @return When the reference was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * When the reference was updated.
     * </p>
     * 
     * @param updateTime
     *        When the reference was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReferenceMetadataResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMd5() != null)
            sb.append("Md5: ").append(getMd5()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReferenceStoreId() != null)
            sb.append("ReferenceStoreId: ").append(getReferenceStoreId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReferenceMetadataResult == false)
            return false;
        GetReferenceMetadataResult other = (GetReferenceMetadataResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMd5() == null ^ this.getMd5() == null)
            return false;
        if (other.getMd5() != null && other.getMd5().equals(this.getMd5()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReferenceStoreId() == null ^ this.getReferenceStoreId() == null)
            return false;
        if (other.getReferenceStoreId() != null && other.getReferenceStoreId().equals(this.getReferenceStoreId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMd5() == null) ? 0 : getMd5().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferenceStoreId() == null) ? 0 : getReferenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetReferenceMetadataResult clone() {
        try {
            return (GetReferenceMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
