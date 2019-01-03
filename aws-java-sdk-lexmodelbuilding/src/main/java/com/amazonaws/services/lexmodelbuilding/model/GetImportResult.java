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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name given to the import job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of resource imported.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The action taken when there was a conflict between an existing resource and a resource in the import file.
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
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure from
     * the <code>failureReason</code> field.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     */
    private java.util.List<String> failureReason;
    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
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

    public GetImportResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * 
     * @param resourceType
     *        The type of resource imported.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * 
     * @return The type of resource imported.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * 
     * @param resourceType
     *        The type of resource imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetImportResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource imported.
     * </p>
     * 
     * @param resourceType
     *        The type of resource imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetImportResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource and a resource in the import file.
     * </p>
     * 
     * @param mergeStrategy
     *        The action taken when there was a conflict between an existing resource and a resource in the import file.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource and a resource in the import file.
     * </p>
     * 
     * @return The action taken when there was a conflict between an existing resource and a resource in the import
     *         file.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource and a resource in the import file.
     * </p>
     * 
     * @param mergeStrategy
     *        The action taken when there was a conflict between an existing resource and a resource in the import file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public GetImportResult withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The action taken when there was a conflict between an existing resource and a resource in the import file.
     * </p>
     * 
     * @param mergeStrategy
     *        The action taken when there was a conflict between an existing resource and a resource in the import file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public GetImportResult withMergeStrategy(MergeStrategy mergeStrategy) {
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

    public GetImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure from
     * the <code>failureReason</code> field.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        from the <code>failureReason</code> field.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure from
     * the <code>failureReason</code> field.
     * </p>
     * 
     * @return The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the
     *         failure from the <code>failureReason</code> field.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure from
     * the <code>failureReason</code> field.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        from the <code>failureReason</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public GetImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure from
     * the <code>failureReason</code> field.
     * </p>
     * 
     * @param importStatus
     *        The status of the import job. If the status is <code>FAILED</code>, you can get the reason for the failure
     *        from the <code>failureReason</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public GetImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * 
     * @return A string that describes why an import job failed to complete.
     */

    public java.util.List<String> getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * 
     * @param failureReason
     *        A string that describes why an import job failed to complete.
     */

    public void setFailureReason(java.util.Collection<String> failureReason) {
        if (failureReason == null) {
            this.failureReason = null;
            return;
        }

        this.failureReason = new java.util.ArrayList<String>(failureReason);
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReason(java.util.Collection)} or {@link #withFailureReason(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReason
     *        A string that describes why an import job failed to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportResult withFailureReason(String... failureReason) {
        if (this.failureReason == null) {
            setFailureReason(new java.util.ArrayList<String>(failureReason.length));
        }
        for (String ele : failureReason) {
            this.failureReason.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string that describes why an import job failed to complete.
     * </p>
     * 
     * @param failureReason
     *        A string that describes why an import job failed to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportResult withFailureReason(java.util.Collection<String> failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     * 
     * @param createdDate
     *        A timestamp for the date and time that the import job was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     * 
     * @return A timestamp for the date and time that the import job was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * A timestamp for the date and time that the import job was created.
     * </p>
     * 
     * @param createdDate
     *        A timestamp for the date and time that the import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportResult withCreatedDate(java.util.Date createdDate) {
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
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
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

        if (obj instanceof GetImportResult == false)
            return false;
        GetImportResult other = (GetImportResult) obj;
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
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
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
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetImportResult clone() {
        try {
            return (GetImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
