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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchDeleteDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business index that contains the documents to delete.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Documents deleted from the Amazon Q Business index.
     * </p>
     */
    private java.util.List<DeleteDocument> documents;
    /**
     * <p>
     * The identifier of the data source sync during which the documents were deleted.
     * </p>
     */
    private String dataSourceSyncId;

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index that contains the documents to delete.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index that contains the documents to delete.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index that contains the documents to delete.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business index that contains the documents to delete.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index that contains the documents to delete.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index that contains the documents to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Documents deleted from the Amazon Q Business index.
     * </p>
     * 
     * @return Documents deleted from the Amazon Q Business index.
     */

    public java.util.List<DeleteDocument> getDocuments() {
        return documents;
    }

    /**
     * <p>
     * Documents deleted from the Amazon Q Business index.
     * </p>
     * 
     * @param documents
     *        Documents deleted from the Amazon Q Business index.
     */

    public void setDocuments(java.util.Collection<DeleteDocument> documents) {
        if (documents == null) {
            this.documents = null;
            return;
        }

        this.documents = new java.util.ArrayList<DeleteDocument>(documents);
    }

    /**
     * <p>
     * Documents deleted from the Amazon Q Business index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocuments(java.util.Collection)} or {@link #withDocuments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documents
     *        Documents deleted from the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withDocuments(DeleteDocument... documents) {
        if (this.documents == null) {
            setDocuments(new java.util.ArrayList<DeleteDocument>(documents.length));
        }
        for (DeleteDocument ele : documents) {
            this.documents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Documents deleted from the Amazon Q Business index.
     * </p>
     * 
     * @param documents
     *        Documents deleted from the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withDocuments(java.util.Collection<DeleteDocument> documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source sync during which the documents were deleted.
     * </p>
     * 
     * @param dataSourceSyncId
     *        The identifier of the data source sync during which the documents were deleted.
     */

    public void setDataSourceSyncId(String dataSourceSyncId) {
        this.dataSourceSyncId = dataSourceSyncId;
    }

    /**
     * <p>
     * The identifier of the data source sync during which the documents were deleted.
     * </p>
     * 
     * @return The identifier of the data source sync during which the documents were deleted.
     */

    public String getDataSourceSyncId() {
        return this.dataSourceSyncId;
    }

    /**
     * <p>
     * The identifier of the data source sync during which the documents were deleted.
     * </p>
     * 
     * @param dataSourceSyncId
     *        The identifier of the data source sync during which the documents were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withDataSourceSyncId(String dataSourceSyncId) {
        setDataSourceSyncId(dataSourceSyncId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getDataSourceSyncId() != null)
            sb.append("DataSourceSyncId: ").append(getDataSourceSyncId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDocumentRequest == false)
            return false;
        BatchDeleteDocumentRequest other = (BatchDeleteDocumentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getDataSourceSyncId() == null ^ this.getDataSourceSyncId() == null)
            return false;
        if (other.getDataSourceSyncId() != null && other.getDataSourceSyncId().equals(this.getDataSourceSyncId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getDataSourceSyncId() == null) ? 0 : getDataSourceSyncId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDocumentRequest clone() {
        return (BatchDeleteDocumentRequest) super.clone();
    }

}
