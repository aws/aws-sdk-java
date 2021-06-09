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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDocumentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and
     * the reason that the status couldn't be found.
     * </p>
     */
    private java.util.List<BatchGetDocumentStatusResponseError> errors;
    /**
     * <p>
     * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of
     * indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the
     * reason why.
     * </p>
     */
    private java.util.List<Status> documentStatusList;

    /**
     * <p>
     * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and
     * the reason that the status couldn't be found.
     * </p>
     * 
     * @return A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the
     *         document and the reason that the status couldn't be found.
     */

    public java.util.List<BatchGetDocumentStatusResponseError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and
     * the reason that the status couldn't be found.
     * </p>
     * 
     * @param errors
     *        A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the
     *        document and the reason that the status couldn't be found.
     */

    public void setErrors(java.util.Collection<BatchGetDocumentStatusResponseError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetDocumentStatusResponseError>(errors);
    }

    /**
     * <p>
     * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and
     * the reason that the status couldn't be found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the
     *        document and the reason that the status couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusResult withErrors(BatchGetDocumentStatusResponseError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetDocumentStatusResponseError>(errors.length));
        }
        for (BatchGetDocumentStatusResponseError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and
     * the reason that the status couldn't be found.
     * </p>
     * 
     * @param errors
     *        A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the
     *        document and the reason that the status couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusResult withErrors(java.util.Collection<BatchGetDocumentStatusResponseError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of
     * indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the
     * reason why.
     * </p>
     * 
     * @return The status of documents. The status indicates if the document is waiting to be indexed, is in the process
     *         of indexing, has completed indexing, or failed indexing. If a document failed indexing, the status
     *         provides the reason why.
     */

    public java.util.List<Status> getDocumentStatusList() {
        return documentStatusList;
    }

    /**
     * <p>
     * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of
     * indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the
     * reason why.
     * </p>
     * 
     * @param documentStatusList
     *        The status of documents. The status indicates if the document is waiting to be indexed, is in the process
     *        of indexing, has completed indexing, or failed indexing. If a document failed indexing, the status
     *        provides the reason why.
     */

    public void setDocumentStatusList(java.util.Collection<Status> documentStatusList) {
        if (documentStatusList == null) {
            this.documentStatusList = null;
            return;
        }

        this.documentStatusList = new java.util.ArrayList<Status>(documentStatusList);
    }

    /**
     * <p>
     * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of
     * indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the
     * reason why.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentStatusList(java.util.Collection)} or {@link #withDocumentStatusList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentStatusList
     *        The status of documents. The status indicates if the document is waiting to be indexed, is in the process
     *        of indexing, has completed indexing, or failed indexing. If a document failed indexing, the status
     *        provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusResult withDocumentStatusList(Status... documentStatusList) {
        if (this.documentStatusList == null) {
            setDocumentStatusList(new java.util.ArrayList<Status>(documentStatusList.length));
        }
        for (Status ele : documentStatusList) {
            this.documentStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of
     * indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the
     * reason why.
     * </p>
     * 
     * @param documentStatusList
     *        The status of documents. The status indicates if the document is waiting to be indexed, is in the process
     *        of indexing, has completed indexing, or failed indexing. If a document failed indexing, the status
     *        provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDocumentStatusResult withDocumentStatusList(java.util.Collection<Status> documentStatusList) {
        setDocumentStatusList(documentStatusList);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getDocumentStatusList() != null)
            sb.append("DocumentStatusList: ").append(getDocumentStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDocumentStatusResult == false)
            return false;
        BatchGetDocumentStatusResult other = (BatchGetDocumentStatusResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getDocumentStatusList() == null ^ this.getDocumentStatusList() == null)
            return false;
        if (other.getDocumentStatusList() != null && other.getDocumentStatusList().equals(this.getDocumentStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getDocumentStatusList() == null) ? 0 : getDocumentStatusList().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDocumentStatusResult clone() {
        try {
            return (BatchGetDocumentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
