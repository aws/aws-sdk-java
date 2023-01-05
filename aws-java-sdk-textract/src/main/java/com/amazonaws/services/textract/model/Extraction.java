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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information extracted by an analysis operation after using StartLendingAnalysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Extraction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Extraction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending documents.
     * </p>
     */
    private LendingDocument lendingDocument;

    private ExpenseDocument expenseDocument;

    private IdentityDocument identityDocument;

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending documents.
     * </p>
     * 
     * @param lendingDocument
     *        Holds the structured data returned by AnalyzeDocument for lending documents.
     */

    public void setLendingDocument(LendingDocument lendingDocument) {
        this.lendingDocument = lendingDocument;
    }

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending documents.
     * </p>
     * 
     * @return Holds the structured data returned by AnalyzeDocument for lending documents.
     */

    public LendingDocument getLendingDocument() {
        return this.lendingDocument;
    }

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending documents.
     * </p>
     * 
     * @param lendingDocument
     *        Holds the structured data returned by AnalyzeDocument for lending documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extraction withLendingDocument(LendingDocument lendingDocument) {
        setLendingDocument(lendingDocument);
        return this;
    }

    /**
     * @param expenseDocument
     */

    public void setExpenseDocument(ExpenseDocument expenseDocument) {
        this.expenseDocument = expenseDocument;
    }

    /**
     * @return
     */

    public ExpenseDocument getExpenseDocument() {
        return this.expenseDocument;
    }

    /**
     * @param expenseDocument
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extraction withExpenseDocument(ExpenseDocument expenseDocument) {
        setExpenseDocument(expenseDocument);
        return this;
    }

    /**
     * @param identityDocument
     */

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    /**
     * @return
     */

    public IdentityDocument getIdentityDocument() {
        return this.identityDocument;
    }

    /**
     * @param identityDocument
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extraction withIdentityDocument(IdentityDocument identityDocument) {
        setIdentityDocument(identityDocument);
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
        if (getLendingDocument() != null)
            sb.append("LendingDocument: ").append(getLendingDocument()).append(",");
        if (getExpenseDocument() != null)
            sb.append("ExpenseDocument: ").append(getExpenseDocument()).append(",");
        if (getIdentityDocument() != null)
            sb.append("IdentityDocument: ").append(getIdentityDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Extraction == false)
            return false;
        Extraction other = (Extraction) obj;
        if (other.getLendingDocument() == null ^ this.getLendingDocument() == null)
            return false;
        if (other.getLendingDocument() != null && other.getLendingDocument().equals(this.getLendingDocument()) == false)
            return false;
        if (other.getExpenseDocument() == null ^ this.getExpenseDocument() == null)
            return false;
        if (other.getExpenseDocument() != null && other.getExpenseDocument().equals(this.getExpenseDocument()) == false)
            return false;
        if (other.getIdentityDocument() == null ^ this.getIdentityDocument() == null)
            return false;
        if (other.getIdentityDocument() != null && other.getIdentityDocument().equals(this.getIdentityDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLendingDocument() == null) ? 0 : getLendingDocument().hashCode());
        hashCode = prime * hashCode + ((getExpenseDocument() == null) ? 0 : getExpenseDocument().hashCode());
        hashCode = prime * hashCode + ((getIdentityDocument() == null) ? 0 : getIdentityDocument().hashCode());
        return hashCode;
    }

    @Override
    public Extraction clone() {
        try {
            return (Extraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.ExtractionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
