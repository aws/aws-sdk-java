/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     */
    private java.util.List<String> documentIdList;

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the documents to delete.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * 
     * @return The identifier of the index that contains the documents to delete.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the documents to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * 
     * @return One or more identifiers for documents to delete from the index.
     */

    public java.util.List<String> getDocumentIdList() {
        return documentIdList;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * 
     * @param documentIdList
     *        One or more identifiers for documents to delete from the index.
     */

    public void setDocumentIdList(java.util.Collection<String> documentIdList) {
        if (documentIdList == null) {
            this.documentIdList = null;
            return;
        }

        this.documentIdList = new java.util.ArrayList<String>(documentIdList);
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentIdList(java.util.Collection)} or {@link #withDocumentIdList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param documentIdList
     *        One or more identifiers for documents to delete from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withDocumentIdList(String... documentIdList) {
        if (this.documentIdList == null) {
            setDocumentIdList(new java.util.ArrayList<String>(documentIdList.length));
        }
        for (String ele : documentIdList) {
            this.documentIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * 
     * @param documentIdList
     *        One or more identifiers for documents to delete from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDocumentRequest withDocumentIdList(java.util.Collection<String> documentIdList) {
        setDocumentIdList(documentIdList);
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
        if (getDocumentIdList() != null)
            sb.append("DocumentIdList: ").append(getDocumentIdList());
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
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDocumentIdList() == null ^ this.getDocumentIdList() == null)
            return false;
        if (other.getDocumentIdList() != null && other.getDocumentIdList().equals(this.getDocumentIdList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDocumentIdList() == null) ? 0 : getDocumentIdList().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDocumentRequest clone() {
        return (BatchDeleteDocumentRequest) super.clone();
    }

}
