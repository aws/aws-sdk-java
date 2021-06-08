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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The parameters used when importing the bot or bot locale.
     * </p>
     */
    private ImportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The strategy used when there was a name conflict between the imported resource and an existing resource. When the
     * merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     */
    private String mergeStrategy;
    /**
     * <p>
     * The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready to use.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * The date and time that the import request was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * A unique identifier for the import.
     * </p>
     * 
     * @param importId
     *        A unique identifier for the import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * A unique identifier for the import.
     * </p>
     * 
     * @return A unique identifier for the import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * A unique identifier for the import.
     * </p>
     * 
     * @param importId
     *        A unique identifier for the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The parameters used when importing the bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The parameters used when importing the bot or bot locale.
     */

    public void setResourceSpecification(ImportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * The parameters used when importing the bot or bot locale.
     * </p>
     * 
     * @return The parameters used when importing the bot or bot locale.
     */

    public ImportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * The parameters used when importing the bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The parameters used when importing the bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withResourceSpecification(ImportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
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

    public StartImportResult withMergeStrategy(String mergeStrategy) {
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

    public StartImportResult withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready to use.
     * </p>
     * 
     * @param importStatus
     *        The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready
     *        to use.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready to use.
     * </p>
     * 
     * @return The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready
     *         to use.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready to use.
     * </p>
     * 
     * @param importStatus
     *        The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready
     *        to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready to use.
     * </p>
     * 
     * @param importStatus
     *        The current status of the import. When the status is <code>Complete</code> the bot or bot alias is ready
     *        to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the import request was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the import request was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the import request was created.
     * </p>
     * 
     * @return The date and time that the import request was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the import request was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the import request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
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
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
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
