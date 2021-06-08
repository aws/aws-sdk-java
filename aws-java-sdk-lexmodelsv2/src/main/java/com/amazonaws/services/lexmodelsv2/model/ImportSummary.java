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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an import in an import list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ImportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the imported resource.
     * </p>
     */
    private String importedResourceId;
    /**
     * <p>
     * The name that you gave the imported resource.
     * </p>
     */
    private String importedResourceName;
    /**
     * <p>
     * The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * </p>
     */
    private String mergeStrategy;
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
     * The unique identifier that Amazon Lex assigned to the import.
     * </p>
     * 
     * @param importId
     *        The unique identifier that Amazon Lex assigned to the import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the import.
     * </p>
     * 
     * @return The unique identifier that Amazon Lex assigned to the import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the import.
     * </p>
     * 
     * @param importId
     *        The unique identifier that Amazon Lex assigned to the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the imported resource.
     * </p>
     * 
     * @param importedResourceId
     *        The unique identifier that Amazon Lex assigned to the imported resource.
     */

    public void setImportedResourceId(String importedResourceId) {
        this.importedResourceId = importedResourceId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the imported resource.
     * </p>
     * 
     * @return The unique identifier that Amazon Lex assigned to the imported resource.
     */

    public String getImportedResourceId() {
        return this.importedResourceId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the imported resource.
     * </p>
     * 
     * @param importedResourceId
     *        The unique identifier that Amazon Lex assigned to the imported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withImportedResourceId(String importedResourceId) {
        setImportedResourceId(importedResourceId);
        return this;
    }

    /**
     * <p>
     * The name that you gave the imported resource.
     * </p>
     * 
     * @param importedResourceName
     *        The name that you gave the imported resource.
     */

    public void setImportedResourceName(String importedResourceName) {
        this.importedResourceName = importedResourceName;
    }

    /**
     * <p>
     * The name that you gave the imported resource.
     * </p>
     * 
     * @return The name that you gave the imported resource.
     */

    public String getImportedResourceName() {
        return this.importedResourceName;
    }

    /**
     * <p>
     * The name that you gave the imported resource.
     * </p>
     * 
     * @param importedResourceName
     *        The name that you gave the imported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withImportedResourceName(String importedResourceName) {
        setImportedResourceName(importedResourceName);
        return this;
    }

    /**
     * <p>
     * The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * </p>
     * 
     * @param importStatus
     *        The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * </p>
     * 
     * @return The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * </p>
     * 
     * @param importStatus
     *        The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportSummary withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * </p>
     * 
     * @param importStatus
     *        The status of the resource. When the status is <code>Completed</code> the resource is ready to build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportSummary withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * </p>
     * 
     * @return The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public ImportSummary withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy used to merge existing bot or bot locale definitions with the imported definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public ImportSummary withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
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

    public ImportSummary withCreationDateTime(java.util.Date creationDateTime) {
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

    public ImportSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getImportedResourceId() != null)
            sb.append("ImportedResourceId: ").append(getImportedResourceId()).append(",");
        if (getImportedResourceName() != null)
            sb.append("ImportedResourceName: ").append(getImportedResourceName()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
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

        if (obj instanceof ImportSummary == false)
            return false;
        ImportSummary other = (ImportSummary) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getImportedResourceId() == null ^ this.getImportedResourceId() == null)
            return false;
        if (other.getImportedResourceId() != null && other.getImportedResourceId().equals(this.getImportedResourceId()) == false)
            return false;
        if (other.getImportedResourceName() == null ^ this.getImportedResourceName() == null)
            return false;
        if (other.getImportedResourceName() != null && other.getImportedResourceName().equals(this.getImportedResourceName()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
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
        hashCode = prime * hashCode + ((getImportedResourceId() == null) ? 0 : getImportedResourceId().hashCode());
        hashCode = prime * hashCode + ((getImportedResourceName() == null) ? 0 : getImportedResourceName().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public ImportSummary clone() {
        try {
            return (ImportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ImportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
