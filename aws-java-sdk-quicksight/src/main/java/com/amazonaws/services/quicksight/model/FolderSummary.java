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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the folder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FolderSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The folder ID.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The display name of the folder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of folder.
     * </p>
     */
    private String folderType;
    /**
     * <p>
     * The time that the folder was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that the folder was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @param folderId
     *        The folder ID.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @return The folder ID.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @param folderId
     *        The folder ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderSummary withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The display name of the folder.
     * </p>
     * 
     * @param name
     *        The display name of the folder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the folder.
     * </p>
     * 
     * @return The display name of the folder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the folder.
     * </p>
     * 
     * @param name
     *        The display name of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of folder.
     * </p>
     * 
     * @param folderType
     *        The type of folder.
     * @see FolderType
     */

    public void setFolderType(String folderType) {
        this.folderType = folderType;
    }

    /**
     * <p>
     * The type of folder.
     * </p>
     * 
     * @return The type of folder.
     * @see FolderType
     */

    public String getFolderType() {
        return this.folderType;
    }

    /**
     * <p>
     * The type of folder.
     * </p>
     * 
     * @param folderType
     *        The type of folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderType
     */

    public FolderSummary withFolderType(String folderType) {
        setFolderType(folderType);
        return this;
    }

    /**
     * <p>
     * The type of folder.
     * </p>
     * 
     * @param folderType
     *        The type of folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderType
     */

    public FolderSummary withFolderType(FolderType folderType) {
        this.folderType = folderType.toString();
        return this;
    }

    /**
     * <p>
     * The time that the folder was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the folder was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the folder was created.
     * </p>
     * 
     * @return The time that the folder was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the folder was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the folder was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that the folder was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the folder was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the folder was last updated.
     * </p>
     * 
     * @return The time that the folder was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the folder was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the folder was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFolderType() != null)
            sb.append("FolderType: ").append(getFolderType()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FolderSummary == false)
            return false;
        FolderSummary other = (FolderSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFolderType() == null ^ this.getFolderType() == null)
            return false;
        if (other.getFolderType() != null && other.getFolderType().equals(this.getFolderType()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFolderType() == null) ? 0 : getFolderType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public FolderSummary clone() {
        try {
            return (FolderSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FolderSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
