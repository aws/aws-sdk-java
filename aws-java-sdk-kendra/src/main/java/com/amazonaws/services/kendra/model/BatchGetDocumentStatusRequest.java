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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDocumentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index to add documents to. The index ID is returned by the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You identify
     * the documents by their document ID and optional attributes.
     * </p>
     */
    private java.util.List<DocumentInfo> documentInfoList;

    /**
     * <p>
     * The identifier of the index to add documents to. The index ID is returned by the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to add documents to. The index ID is returned by the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index to add documents to. The index ID is returned by the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     * </p>
     * 
     * @return The identifier of the index to add documents to. The index ID is returned by the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index to add documents to. The index ID is returned by the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to add documents to. The index ID is returned by the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html"> CreateIndex </a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You identify
     * the documents by their document ID and optional attributes.
     * </p>
     * 
     * @return A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You
     *         identify the documents by their document ID and optional attributes.
     */

    public java.util.List<DocumentInfo> getDocumentInfoList() {
        return documentInfoList;
    }

    /**
     * <p>
     * A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You identify
     * the documents by their document ID and optional attributes.
     * </p>
     * 
     * @param documentInfoList
     *        A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You
     *        identify the documents by their document ID and optional attributes.
     */

    public void setDocumentInfoList(java.util.Collection<DocumentInfo> documentInfoList) {
        if (documentInfoList == null) {
            this.documentInfoList = null;
            return;
        }

        this.documentInfoList = new java.util.ArrayList<DocumentInfo>(documentInfoList);
    }

    /**
     * <p>
     * A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You identify
     * the documents by their document ID and optional attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentInfoList(java.util.Collection)} or {@link #withDocumentInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param documentInfoList
     *        A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You
     *        identify the documents by their document ID and optional attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusRequest withDocumentInfoList(DocumentInfo... documentInfoList) {
        if (this.documentInfoList == null) {
            setDocumentInfoList(new java.util.ArrayList<DocumentInfo>(documentInfoList.length));
        }
        for (DocumentInfo ele : documentInfoList) {
            this.documentInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You identify
     * the documents by their document ID and optional attributes.
     * </p>
     * 
     * @param documentInfoList
     *        A list of <code>DocumentInfo</code> objects that identify the documents for which to get the status. You
     *        identify the documents by their document ID and optional attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusRequest withDocumentInfoList(java.util.Collection<DocumentInfo> documentInfoList) {
        setDocumentInfoList(documentInfoList);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDocumentInfoList() != null)
            sb.append("DocumentInfoList: ").append(getDocumentInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDocumentStatusRequest == false)
            return false;
        BatchGetDocumentStatusRequest other = (BatchGetDocumentStatusRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDocumentInfoList() == null ^ this.getDocumentInfoList() == null)
            return false;
        if (other.getDocumentInfoList() != null && other.getDocumentInfoList().equals(this.getDocumentInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDocumentInfoList() == null) ? 0 : getDocumentInfoList().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDocumentStatusRequest clone() {
        return (BatchGetDocumentStatusRequest) super.clone();
    }

}
