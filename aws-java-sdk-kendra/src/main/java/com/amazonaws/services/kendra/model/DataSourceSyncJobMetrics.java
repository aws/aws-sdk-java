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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Maps a batch delete document request to a specific data source sync job. This is optional and should only be supplied
 * when documents are deleted by a data source connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceSyncJobMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSyncJobMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of documents added from the data source up to now in the data source sync.
     * </p>
     */
    private String documentsAdded;
    /**
     * <p>
     * The number of documents modified in the data source up to now in the data source sync run.
     * </p>
     */
    private String documentsModified;
    /**
     * <p>
     * The number of documents deleted from the data source up to now in the data source sync run.
     * </p>
     */
    private String documentsDeleted;
    /**
     * <p>
     * The number of documents that failed to sync from the data source up to now in the data source sync run.
     * </p>
     */
    private String documentsFailed;
    /**
     * <p>
     * The current number of documents crawled by the current sync job in the data source.
     * </p>
     */
    private String documentsScanned;

    /**
     * <p>
     * The number of documents added from the data source up to now in the data source sync.
     * </p>
     * 
     * @param documentsAdded
     *        The number of documents added from the data source up to now in the data source sync.
     */

    public void setDocumentsAdded(String documentsAdded) {
        this.documentsAdded = documentsAdded;
    }

    /**
     * <p>
     * The number of documents added from the data source up to now in the data source sync.
     * </p>
     * 
     * @return The number of documents added from the data source up to now in the data source sync.
     */

    public String getDocumentsAdded() {
        return this.documentsAdded;
    }

    /**
     * <p>
     * The number of documents added from the data source up to now in the data source sync.
     * </p>
     * 
     * @param documentsAdded
     *        The number of documents added from the data source up to now in the data source sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetrics withDocumentsAdded(String documentsAdded) {
        setDocumentsAdded(documentsAdded);
        return this;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsModified
     *        The number of documents modified in the data source up to now in the data source sync run.
     */

    public void setDocumentsModified(String documentsModified) {
        this.documentsModified = documentsModified;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data source sync run.
     * </p>
     * 
     * @return The number of documents modified in the data source up to now in the data source sync run.
     */

    public String getDocumentsModified() {
        return this.documentsModified;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsModified
     *        The number of documents modified in the data source up to now in the data source sync run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetrics withDocumentsModified(String documentsModified) {
        setDocumentsModified(documentsModified);
        return this;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsDeleted
     *        The number of documents deleted from the data source up to now in the data source sync run.
     */

    public void setDocumentsDeleted(String documentsDeleted) {
        this.documentsDeleted = documentsDeleted;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the data source sync run.
     * </p>
     * 
     * @return The number of documents deleted from the data source up to now in the data source sync run.
     */

    public String getDocumentsDeleted() {
        return this.documentsDeleted;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsDeleted
     *        The number of documents deleted from the data source up to now in the data source sync run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetrics withDocumentsDeleted(String documentsDeleted) {
        setDocumentsDeleted(documentsDeleted);
        return this;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsFailed
     *        The number of documents that failed to sync from the data source up to now in the data source sync run.
     */

    public void setDocumentsFailed(String documentsFailed) {
        this.documentsFailed = documentsFailed;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to now in the data source sync run.
     * </p>
     * 
     * @return The number of documents that failed to sync from the data source up to now in the data source sync run.
     */

    public String getDocumentsFailed() {
        return this.documentsFailed;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to now in the data source sync run.
     * </p>
     * 
     * @param documentsFailed
     *        The number of documents that failed to sync from the data source up to now in the data source sync run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetrics withDocumentsFailed(String documentsFailed) {
        setDocumentsFailed(documentsFailed);
        return this;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the data source.
     * </p>
     * 
     * @param documentsScanned
     *        The current number of documents crawled by the current sync job in the data source.
     */

    public void setDocumentsScanned(String documentsScanned) {
        this.documentsScanned = documentsScanned;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the data source.
     * </p>
     * 
     * @return The current number of documents crawled by the current sync job in the data source.
     */

    public String getDocumentsScanned() {
        return this.documentsScanned;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the data source.
     * </p>
     * 
     * @param documentsScanned
     *        The current number of documents crawled by the current sync job in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJobMetrics withDocumentsScanned(String documentsScanned) {
        setDocumentsScanned(documentsScanned);
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
        if (getDocumentsAdded() != null)
            sb.append("DocumentsAdded: ").append(getDocumentsAdded()).append(",");
        if (getDocumentsModified() != null)
            sb.append("DocumentsModified: ").append(getDocumentsModified()).append(",");
        if (getDocumentsDeleted() != null)
            sb.append("DocumentsDeleted: ").append(getDocumentsDeleted()).append(",");
        if (getDocumentsFailed() != null)
            sb.append("DocumentsFailed: ").append(getDocumentsFailed()).append(",");
        if (getDocumentsScanned() != null)
            sb.append("DocumentsScanned: ").append(getDocumentsScanned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSyncJobMetrics == false)
            return false;
        DataSourceSyncJobMetrics other = (DataSourceSyncJobMetrics) obj;
        if (other.getDocumentsAdded() == null ^ this.getDocumentsAdded() == null)
            return false;
        if (other.getDocumentsAdded() != null && other.getDocumentsAdded().equals(this.getDocumentsAdded()) == false)
            return false;
        if (other.getDocumentsModified() == null ^ this.getDocumentsModified() == null)
            return false;
        if (other.getDocumentsModified() != null && other.getDocumentsModified().equals(this.getDocumentsModified()) == false)
            return false;
        if (other.getDocumentsDeleted() == null ^ this.getDocumentsDeleted() == null)
            return false;
        if (other.getDocumentsDeleted() != null && other.getDocumentsDeleted().equals(this.getDocumentsDeleted()) == false)
            return false;
        if (other.getDocumentsFailed() == null ^ this.getDocumentsFailed() == null)
            return false;
        if (other.getDocumentsFailed() != null && other.getDocumentsFailed().equals(this.getDocumentsFailed()) == false)
            return false;
        if (other.getDocumentsScanned() == null ^ this.getDocumentsScanned() == null)
            return false;
        if (other.getDocumentsScanned() != null && other.getDocumentsScanned().equals(this.getDocumentsScanned()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentsAdded() == null) ? 0 : getDocumentsAdded().hashCode());
        hashCode = prime * hashCode + ((getDocumentsModified() == null) ? 0 : getDocumentsModified().hashCode());
        hashCode = prime * hashCode + ((getDocumentsDeleted() == null) ? 0 : getDocumentsDeleted().hashCode());
        hashCode = prime * hashCode + ((getDocumentsFailed() == null) ? 0 : getDocumentsFailed().hashCode());
        hashCode = prime * hashCode + ((getDocumentsScanned() == null) ? 0 : getDocumentsScanned().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSyncJobMetrics clone() {
        try {
            return (DataSourceSyncJobMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DataSourceSyncJobMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
