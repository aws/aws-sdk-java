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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the described import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The specifications of the imported bot or bot locale.
     * </p>
     */
    private ImportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the resource created by the import.
     * </p>
     */
    private String importedResourceId;
    /**
     * <p>
     * The name of the imported resource.
     * </p>
     */
    private String importedResourceName;
    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     */
    private String mergeStrategy;
    /**
     * <p>
     * The status of the import process. When the status is <code>Completed</code> the resource is imported and ready
     * for use.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     * failture.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The date and time that the import was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time that the import was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier of the described import.
     * </p>
     * 
     * @param importId
     *        The unique identifier of the described import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The unique identifier of the described import.
     * </p>
     * 
     * @return The unique identifier of the described import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The unique identifier of the described import.
     * </p>
     * 
     * @param importId
     *        The unique identifier of the described import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The specifications of the imported bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The specifications of the imported bot or bot locale.
     */

    public void setResourceSpecification(ImportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * The specifications of the imported bot or bot locale.
     * </p>
     * 
     * @return The specifications of the imported bot or bot locale.
     */

    public ImportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * The specifications of the imported bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The specifications of the imported bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withResourceSpecification(ImportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the resource created by the import.
     * </p>
     * 
     * @param importedResourceId
     *        The unique identifier that Amazon Lex assigned to the resource created by the import.
     */

    public void setImportedResourceId(String importedResourceId) {
        this.importedResourceId = importedResourceId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the resource created by the import.
     * </p>
     * 
     * @return The unique identifier that Amazon Lex assigned to the resource created by the import.
     */

    public String getImportedResourceId() {
        return this.importedResourceId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the resource created by the import.
     * </p>
     * 
     * @param importedResourceId
     *        The unique identifier that Amazon Lex assigned to the resource created by the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withImportedResourceId(String importedResourceId) {
        setImportedResourceId(importedResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the imported resource.
     * </p>
     * 
     * @param importedResourceName
     *        The name of the imported resource.
     */

    public void setImportedResourceName(String importedResourceName) {
        this.importedResourceName = importedResourceName;
    }

    /**
     * <p>
     * The name of the imported resource.
     * </p>
     * 
     * @return The name of the imported resource.
     */

    public String getImportedResourceName() {
        return this.importedResourceName;
    }

    /**
     * <p>
     * The name of the imported resource.
     * </p>
     * 
     * @param importedResourceName
     *        The name of the imported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withImportedResourceName(String importedResourceName) {
        setImportedResourceName(importedResourceName);
        return this;
    }

    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used when there was a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @return The strategy used when there was a name conflict between the imported resource and an existing resource.
     *         When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *         import fails.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used when there was a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public DescribeImportResult withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used when there was a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public DescribeImportResult withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The status of the import process. When the status is <code>Completed</code> the resource is imported and ready
     * for use.
     * </p>
     * 
     * @param importStatus
     *        The status of the import process. When the status is <code>Completed</code> the resource is imported and
     *        ready for use.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import process. When the status is <code>Completed</code> the resource is imported and ready
     * for use.
     * </p>
     * 
     * @return The status of the import process. When the status is <code>Completed</code> the resource is imported and
     *         ready for use.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import process. When the status is <code>Completed</code> the resource is imported and ready
     * for use.
     * </p>
     * 
     * @param importStatus
     *        The status of the import process. When the status is <code>Completed</code> the resource is imported and
     *        ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public DescribeImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import process. When the status is <code>Completed</code> the resource is imported and ready
     * for use.
     * </p>
     * 
     * @param importStatus
     *        The status of the import process. When the status is <code>Completed</code> the resource is imported and
     *        ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public DescribeImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     * failture.
     * </p>
     * 
     * @return If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     *         failture.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     * failture.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     *        failture.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     * failture.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     *        failture.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     * failture.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>importStatus</code> field is <code>Failed</code>, this provides one or more reasons for the
     *        failture.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The date and time that the import was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the import was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the import was created.
     * </p>
     * 
     * @return The date and time that the import was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the import was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the import was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the import was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the import was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the import was last updated.
     * </p>
     * 
     * @return The date and time that the import was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the import was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the import was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getImportedResourceId() != null)
            sb.append("ImportedResourceId: ").append(getImportedResourceId()).append(",");
        if (getImportedResourceName() != null)
            sb.append("ImportedResourceName: ").append(getImportedResourceName()).append(",");
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImportResult == false)
            return false;
        DescribeImportResult other = (DescribeImportResult) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getImportedResourceId() == null ^ this.getImportedResourceId() == null)
            return false;
        if (other.getImportedResourceId() != null && other.getImportedResourceId().equals(this.getImportedResourceId()) == false)
            return false;
        if (other.getImportedResourceName() == null ^ this.getImportedResourceName() == null)
            return false;
        if (other.getImportedResourceName() != null && other.getImportedResourceName().equals(this.getImportedResourceName()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getImportedResourceId() == null) ? 0 : getImportedResourceId().hashCode());
        hashCode = prime * hashCode + ((getImportedResourceName() == null) ? 0 : getImportedResourceName().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImportResult clone() {
        try {
            return (DescribeImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
