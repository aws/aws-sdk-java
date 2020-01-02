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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of documents that were not added to the index because the document failed a validation check. Each
     * document contains an error message that indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * </p>
     */
    private java.util.List<BatchPutDocumentResponseFailedDocument> failedDocuments;

    /**
     * <p>
     * A list of documents that were not added to the index because the document failed a validation check. Each
     * document contains an error message that indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * </p>
     * 
     * @return A list of documents that were not added to the index because the document failed a validation check. Each
     *         document contains an error message that indicates why the document couldn't be added to the index.</p>
     *         <p>
     *         If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     */

    public java.util.List<BatchPutDocumentResponseFailedDocument> getFailedDocuments() {
        return failedDocuments;
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document failed a validation check. Each
     * document contains an error message that indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * </p>
     * 
     * @param failedDocuments
     *        A list of documents that were not added to the index because the document failed a validation check. Each
     *        document contains an error message that indicates why the document couldn't be added to the index.</p>
     *        <p>
     *        If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     */

    public void setFailedDocuments(java.util.Collection<BatchPutDocumentResponseFailedDocument> failedDocuments) {
        if (failedDocuments == null) {
            this.failedDocuments = null;
            return;
        }

        this.failedDocuments = new java.util.ArrayList<BatchPutDocumentResponseFailedDocument>(failedDocuments);
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document failed a validation check. Each
     * document contains an error message that indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedDocuments(java.util.Collection)} or {@link #withFailedDocuments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedDocuments
     *        A list of documents that were not added to the index because the document failed a validation check. Each
     *        document contains an error message that indicates why the document couldn't be added to the index.</p>
     *        <p>
     *        If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentResult withFailedDocuments(BatchPutDocumentResponseFailedDocument... failedDocuments) {
        if (this.failedDocuments == null) {
            setFailedDocuments(new java.util.ArrayList<BatchPutDocumentResponseFailedDocument>(failedDocuments.length));
        }
        for (BatchPutDocumentResponseFailedDocument ele : failedDocuments) {
            this.failedDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document failed a validation check. Each
     * document contains an error message that indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * </p>
     * 
     * @param failedDocuments
     *        A list of documents that were not added to the index because the document failed a validation check. Each
     *        document contains an error message that indicates why the document couldn't be added to the index.</p>
     *        <p>
     *        If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentResult withFailedDocuments(java.util.Collection<BatchPutDocumentResponseFailedDocument> failedDocuments) {
        setFailedDocuments(failedDocuments);
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
        if (getFailedDocuments() != null)
            sb.append("FailedDocuments: ").append(getFailedDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutDocumentResult == false)
            return false;
        BatchPutDocumentResult other = (BatchPutDocumentResult) obj;
        if (other.getFailedDocuments() == null ^ this.getFailedDocuments() == null)
            return false;
        if (other.getFailedDocuments() != null && other.getFailedDocuments().equals(this.getFailedDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedDocuments() == null) ? 0 : getFailedDocuments().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutDocumentResult clone() {
        try {
            return (BatchPutDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
