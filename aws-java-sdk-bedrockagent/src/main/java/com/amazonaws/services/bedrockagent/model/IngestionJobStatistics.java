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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the statistics for the ingestion job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/IngestionJobStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionJobStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of source documents that was deleted.
     * </p>
     */
    private Long numberOfDocumentsDeleted;
    /**
     * <p>
     * The number of source documents that failed to be ingested.
     * </p>
     */
    private Long numberOfDocumentsFailed;
    /**
     * <p>
     * The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     * </p>
     */
    private Long numberOfDocumentsScanned;
    /**
     * <p>
     * The number of metadata files that were updated or deleted.
     * </p>
     */
    private Long numberOfMetadataDocumentsModified;
    /**
     * <p>
     * The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     * </p>
     */
    private Long numberOfMetadataDocumentsScanned;
    /**
     * <p>
     * The number of modified source documents in the data source that were successfully indexed.
     * </p>
     */
    private Long numberOfModifiedDocumentsIndexed;
    /**
     * <p>
     * The number of new source documents in the data source that were successfully indexed.
     * </p>
     */
    private Long numberOfNewDocumentsIndexed;

    /**
     * <p>
     * The number of source documents that was deleted.
     * </p>
     * 
     * @param numberOfDocumentsDeleted
     *        The number of source documents that was deleted.
     */

    public void setNumberOfDocumentsDeleted(Long numberOfDocumentsDeleted) {
        this.numberOfDocumentsDeleted = numberOfDocumentsDeleted;
    }

    /**
     * <p>
     * The number of source documents that was deleted.
     * </p>
     * 
     * @return The number of source documents that was deleted.
     */

    public Long getNumberOfDocumentsDeleted() {
        return this.numberOfDocumentsDeleted;
    }

    /**
     * <p>
     * The number of source documents that was deleted.
     * </p>
     * 
     * @param numberOfDocumentsDeleted
     *        The number of source documents that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsDeleted(Long numberOfDocumentsDeleted) {
        setNumberOfDocumentsDeleted(numberOfDocumentsDeleted);
        return this;
    }

    /**
     * <p>
     * The number of source documents that failed to be ingested.
     * </p>
     * 
     * @param numberOfDocumentsFailed
     *        The number of source documents that failed to be ingested.
     */

    public void setNumberOfDocumentsFailed(Long numberOfDocumentsFailed) {
        this.numberOfDocumentsFailed = numberOfDocumentsFailed;
    }

    /**
     * <p>
     * The number of source documents that failed to be ingested.
     * </p>
     * 
     * @return The number of source documents that failed to be ingested.
     */

    public Long getNumberOfDocumentsFailed() {
        return this.numberOfDocumentsFailed;
    }

    /**
     * <p>
     * The number of source documents that failed to be ingested.
     * </p>
     * 
     * @param numberOfDocumentsFailed
     *        The number of source documents that failed to be ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsFailed(Long numberOfDocumentsFailed) {
        setNumberOfDocumentsFailed(numberOfDocumentsFailed);
        return this;
    }

    /**
     * <p>
     * The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     * </p>
     * 
     * @param numberOfDocumentsScanned
     *        The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     */

    public void setNumberOfDocumentsScanned(Long numberOfDocumentsScanned) {
        this.numberOfDocumentsScanned = numberOfDocumentsScanned;
    }

    /**
     * <p>
     * The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     * </p>
     * 
     * @return The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     */

    public Long getNumberOfDocumentsScanned() {
        return this.numberOfDocumentsScanned;
    }

    /**
     * <p>
     * The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     * </p>
     * 
     * @param numberOfDocumentsScanned
     *        The total number of source documents that were scanned. Includes new, updated, and unchanged documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsScanned(Long numberOfDocumentsScanned) {
        setNumberOfDocumentsScanned(numberOfDocumentsScanned);
        return this;
    }

    /**
     * <p>
     * The number of metadata files that were updated or deleted.
     * </p>
     * 
     * @param numberOfMetadataDocumentsModified
     *        The number of metadata files that were updated or deleted.
     */

    public void setNumberOfMetadataDocumentsModified(Long numberOfMetadataDocumentsModified) {
        this.numberOfMetadataDocumentsModified = numberOfMetadataDocumentsModified;
    }

    /**
     * <p>
     * The number of metadata files that were updated or deleted.
     * </p>
     * 
     * @return The number of metadata files that were updated or deleted.
     */

    public Long getNumberOfMetadataDocumentsModified() {
        return this.numberOfMetadataDocumentsModified;
    }

    /**
     * <p>
     * The number of metadata files that were updated or deleted.
     * </p>
     * 
     * @param numberOfMetadataDocumentsModified
     *        The number of metadata files that were updated or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfMetadataDocumentsModified(Long numberOfMetadataDocumentsModified) {
        setNumberOfMetadataDocumentsModified(numberOfMetadataDocumentsModified);
        return this;
    }

    /**
     * <p>
     * The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     * </p>
     * 
     * @param numberOfMetadataDocumentsScanned
     *        The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     */

    public void setNumberOfMetadataDocumentsScanned(Long numberOfMetadataDocumentsScanned) {
        this.numberOfMetadataDocumentsScanned = numberOfMetadataDocumentsScanned;
    }

    /**
     * <p>
     * The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     * </p>
     * 
     * @return The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     */

    public Long getNumberOfMetadataDocumentsScanned() {
        return this.numberOfMetadataDocumentsScanned;
    }

    /**
     * <p>
     * The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     * </p>
     * 
     * @param numberOfMetadataDocumentsScanned
     *        The total number of metadata files that were scanned. Includes new, updated, and unchanged files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfMetadataDocumentsScanned(Long numberOfMetadataDocumentsScanned) {
        setNumberOfMetadataDocumentsScanned(numberOfMetadataDocumentsScanned);
        return this;
    }

    /**
     * <p>
     * The number of modified source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @param numberOfModifiedDocumentsIndexed
     *        The number of modified source documents in the data source that were successfully indexed.
     */

    public void setNumberOfModifiedDocumentsIndexed(Long numberOfModifiedDocumentsIndexed) {
        this.numberOfModifiedDocumentsIndexed = numberOfModifiedDocumentsIndexed;
    }

    /**
     * <p>
     * The number of modified source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @return The number of modified source documents in the data source that were successfully indexed.
     */

    public Long getNumberOfModifiedDocumentsIndexed() {
        return this.numberOfModifiedDocumentsIndexed;
    }

    /**
     * <p>
     * The number of modified source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @param numberOfModifiedDocumentsIndexed
     *        The number of modified source documents in the data source that were successfully indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfModifiedDocumentsIndexed(Long numberOfModifiedDocumentsIndexed) {
        setNumberOfModifiedDocumentsIndexed(numberOfModifiedDocumentsIndexed);
        return this;
    }

    /**
     * <p>
     * The number of new source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @param numberOfNewDocumentsIndexed
     *        The number of new source documents in the data source that were successfully indexed.
     */

    public void setNumberOfNewDocumentsIndexed(Long numberOfNewDocumentsIndexed) {
        this.numberOfNewDocumentsIndexed = numberOfNewDocumentsIndexed;
    }

    /**
     * <p>
     * The number of new source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @return The number of new source documents in the data source that were successfully indexed.
     */

    public Long getNumberOfNewDocumentsIndexed() {
        return this.numberOfNewDocumentsIndexed;
    }

    /**
     * <p>
     * The number of new source documents in the data source that were successfully indexed.
     * </p>
     * 
     * @param numberOfNewDocumentsIndexed
     *        The number of new source documents in the data source that were successfully indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfNewDocumentsIndexed(Long numberOfNewDocumentsIndexed) {
        setNumberOfNewDocumentsIndexed(numberOfNewDocumentsIndexed);
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
        if (getNumberOfDocumentsDeleted() != null)
            sb.append("NumberOfDocumentsDeleted: ").append(getNumberOfDocumentsDeleted()).append(",");
        if (getNumberOfDocumentsFailed() != null)
            sb.append("NumberOfDocumentsFailed: ").append(getNumberOfDocumentsFailed()).append(",");
        if (getNumberOfDocumentsScanned() != null)
            sb.append("NumberOfDocumentsScanned: ").append(getNumberOfDocumentsScanned()).append(",");
        if (getNumberOfMetadataDocumentsModified() != null)
            sb.append("NumberOfMetadataDocumentsModified: ").append(getNumberOfMetadataDocumentsModified()).append(",");
        if (getNumberOfMetadataDocumentsScanned() != null)
            sb.append("NumberOfMetadataDocumentsScanned: ").append(getNumberOfMetadataDocumentsScanned()).append(",");
        if (getNumberOfModifiedDocumentsIndexed() != null)
            sb.append("NumberOfModifiedDocumentsIndexed: ").append(getNumberOfModifiedDocumentsIndexed()).append(",");
        if (getNumberOfNewDocumentsIndexed() != null)
            sb.append("NumberOfNewDocumentsIndexed: ").append(getNumberOfNewDocumentsIndexed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionJobStatistics == false)
            return false;
        IngestionJobStatistics other = (IngestionJobStatistics) obj;
        if (other.getNumberOfDocumentsDeleted() == null ^ this.getNumberOfDocumentsDeleted() == null)
            return false;
        if (other.getNumberOfDocumentsDeleted() != null && other.getNumberOfDocumentsDeleted().equals(this.getNumberOfDocumentsDeleted()) == false)
            return false;
        if (other.getNumberOfDocumentsFailed() == null ^ this.getNumberOfDocumentsFailed() == null)
            return false;
        if (other.getNumberOfDocumentsFailed() != null && other.getNumberOfDocumentsFailed().equals(this.getNumberOfDocumentsFailed()) == false)
            return false;
        if (other.getNumberOfDocumentsScanned() == null ^ this.getNumberOfDocumentsScanned() == null)
            return false;
        if (other.getNumberOfDocumentsScanned() != null && other.getNumberOfDocumentsScanned().equals(this.getNumberOfDocumentsScanned()) == false)
            return false;
        if (other.getNumberOfMetadataDocumentsModified() == null ^ this.getNumberOfMetadataDocumentsModified() == null)
            return false;
        if (other.getNumberOfMetadataDocumentsModified() != null
                && other.getNumberOfMetadataDocumentsModified().equals(this.getNumberOfMetadataDocumentsModified()) == false)
            return false;
        if (other.getNumberOfMetadataDocumentsScanned() == null ^ this.getNumberOfMetadataDocumentsScanned() == null)
            return false;
        if (other.getNumberOfMetadataDocumentsScanned() != null
                && other.getNumberOfMetadataDocumentsScanned().equals(this.getNumberOfMetadataDocumentsScanned()) == false)
            return false;
        if (other.getNumberOfModifiedDocumentsIndexed() == null ^ this.getNumberOfModifiedDocumentsIndexed() == null)
            return false;
        if (other.getNumberOfModifiedDocumentsIndexed() != null
                && other.getNumberOfModifiedDocumentsIndexed().equals(this.getNumberOfModifiedDocumentsIndexed()) == false)
            return false;
        if (other.getNumberOfNewDocumentsIndexed() == null ^ this.getNumberOfNewDocumentsIndexed() == null)
            return false;
        if (other.getNumberOfNewDocumentsIndexed() != null && other.getNumberOfNewDocumentsIndexed().equals(this.getNumberOfNewDocumentsIndexed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfDocumentsDeleted() == null) ? 0 : getNumberOfDocumentsDeleted().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDocumentsFailed() == null) ? 0 : getNumberOfDocumentsFailed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDocumentsScanned() == null) ? 0 : getNumberOfDocumentsScanned().hashCode());
        hashCode = prime * hashCode + ((getNumberOfMetadataDocumentsModified() == null) ? 0 : getNumberOfMetadataDocumentsModified().hashCode());
        hashCode = prime * hashCode + ((getNumberOfMetadataDocumentsScanned() == null) ? 0 : getNumberOfMetadataDocumentsScanned().hashCode());
        hashCode = prime * hashCode + ((getNumberOfModifiedDocumentsIndexed() == null) ? 0 : getNumberOfModifiedDocumentsIndexed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNewDocumentsIndexed() == null) ? 0 : getNumberOfNewDocumentsIndexed().hashCode());
        return hashCode;
    }

    @Override
    public IngestionJobStatistics clone() {
        try {
            return (IngestionJobStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.IngestionJobStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
