/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeExpense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzeExpenseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseDocument> expenseDocuments;

    /**
     * @param documentMetadata
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * @return
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * @param documentMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeExpenseResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @return The expenses detected by Amazon Textract.
     */

    public java.util.List<ExpenseDocument> getExpenseDocuments() {
        return expenseDocuments;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     */

    public void setExpenseDocuments(java.util.Collection<ExpenseDocument> expenseDocuments) {
        if (expenseDocuments == null) {
            this.expenseDocuments = null;
            return;
        }

        this.expenseDocuments = new java.util.ArrayList<ExpenseDocument>(expenseDocuments);
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpenseDocuments(java.util.Collection)} or {@link #withExpenseDocuments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeExpenseResult withExpenseDocuments(ExpenseDocument... expenseDocuments) {
        if (this.expenseDocuments == null) {
            setExpenseDocuments(new java.util.ArrayList<ExpenseDocument>(expenseDocuments.length));
        }
        for (ExpenseDocument ele : expenseDocuments) {
            this.expenseDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeExpenseResult withExpenseDocuments(java.util.Collection<ExpenseDocument> expenseDocuments) {
        setExpenseDocuments(expenseDocuments);
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
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getExpenseDocuments() != null)
            sb.append("ExpenseDocuments: ").append(getExpenseDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeExpenseResult == false)
            return false;
        AnalyzeExpenseResult other = (AnalyzeExpenseResult) obj;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getExpenseDocuments() == null ^ this.getExpenseDocuments() == null)
            return false;
        if (other.getExpenseDocuments() != null && other.getExpenseDocuments().equals(this.getExpenseDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getExpenseDocuments() == null) ? 0 : getExpenseDocuments().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzeExpenseResult clone() {
        try {
            return (AnalyzeExpenseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
