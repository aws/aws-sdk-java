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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name given to the import job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of resource to import.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The action to take when there is a merge conflict.
     * </p>
     */
    private String mergeStrategy;
    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure using
     * the <code>GetImport</code> operation.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * A timestamp for the date and time that the import job was requested.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * 
     * @param name
     *        The name given to the import job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * 
     * @return The name given to the import job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name given to the import job.
     * </p>
     * 
     * @param name
     *        The name given to the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of resource to import.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to import.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to import.
     * </p>
     * 
     * @return The type of resource to import.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to import.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StartImportResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to import.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StartImportResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The action to take when there is a merge conflict.
     * </p>
     * 
     * @param mergeStrategy
     *        The action to take when there is a merge conflict.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The action to take when there is a merge conflict.
     * </p>
     * 
     * @return The action to take when there is a merge conflict.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The action to take when there is a merge conflict.
     * </p>
     * 
     * @param mergeStrategy
     *        The action to take when there is a merge conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportResult withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The action to take when there is a merge conflict.
     * </p>
     * 
     * @param mergeStrategy
     *        The action to take when there is a merge conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportResult withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     * 
     * @param importId
     *        The identifier for the specific import job.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     * 
     * @return The identifier for the specific import job.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The identifier for the specific import job.
     * </p>
     * 
     * @param importId
     *        The identifier for the specific import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure using
     * the <code>GetImport</code> operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        using the <code>GetImport</code> operation.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure using
     * the <code>GetImport</code> operation.
     * </p>
     * 
     * @return The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the
     *         failure using the <code>GetImport</code> operation.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure using
     * the <code>GetImport</code> operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        using the <code>GetImport</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure using
     * the <code>GetImport</code> operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        using the <code>GetImport</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was requested.
     * </p>
     * 
     * @param createdDate
     *        A timestamp for the date and time that the import job was requested.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was requested.
     * </p>
     * 
     * @return A timestamp for the date and time that the import job was requested.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was requested.
     * </p>
     * 
     * @param createdDate
     *        A timestamp for the date and time that the import job was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportResult == false)
            return false;
        StartImportResult other = (StartImportResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public StartImportResult clone() {
        try {
            return (StartImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
