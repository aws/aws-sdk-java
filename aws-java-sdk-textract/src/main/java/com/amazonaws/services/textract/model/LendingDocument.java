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
 * Holds the structured data returned by AnalyzeDocument for lending documents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LendingDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LendingDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     */
    private java.util.List<LendingField> lendingFields;
    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     */
    private java.util.List<SignatureDetection> signatureDetections;

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * 
     * @return An array of LendingField objects.
     */

    public java.util.List<LendingField> getLendingFields() {
        return lendingFields;
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * 
     * @param lendingFields
     *        An array of LendingField objects.
     */

    public void setLendingFields(java.util.Collection<LendingField> lendingFields) {
        if (lendingFields == null) {
            this.lendingFields = null;
            return;
        }

        this.lendingFields = new java.util.ArrayList<LendingField>(lendingFields);
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLendingFields(java.util.Collection)} or {@link #withLendingFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lendingFields
     *        An array of LendingField objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDocument withLendingFields(LendingField... lendingFields) {
        if (this.lendingFields == null) {
            setLendingFields(new java.util.ArrayList<LendingField>(lendingFields.length));
        }
        for (LendingField ele : lendingFields) {
            this.lendingFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * 
     * @param lendingFields
     *        An array of LendingField objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDocument withLendingFields(java.util.Collection<LendingField> lendingFields) {
        setLendingFields(lendingFields);
        return this;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * 
     * @return A list of signatures detected in a lending document.
     */

    public java.util.List<SignatureDetection> getSignatureDetections() {
        return signatureDetections;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * 
     * @param signatureDetections
     *        A list of signatures detected in a lending document.
     */

    public void setSignatureDetections(java.util.Collection<SignatureDetection> signatureDetections) {
        if (signatureDetections == null) {
            this.signatureDetections = null;
            return;
        }

        this.signatureDetections = new java.util.ArrayList<SignatureDetection>(signatureDetections);
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignatureDetections(java.util.Collection)} or {@link #withSignatureDetections(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param signatureDetections
     *        A list of signatures detected in a lending document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDocument withSignatureDetections(SignatureDetection... signatureDetections) {
        if (this.signatureDetections == null) {
            setSignatureDetections(new java.util.ArrayList<SignatureDetection>(signatureDetections.length));
        }
        for (SignatureDetection ele : signatureDetections) {
            this.signatureDetections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * 
     * @param signatureDetections
     *        A list of signatures detected in a lending document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingDocument withSignatureDetections(java.util.Collection<SignatureDetection> signatureDetections) {
        setSignatureDetections(signatureDetections);
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
        if (getLendingFields() != null)
            sb.append("LendingFields: ").append(getLendingFields()).append(",");
        if (getSignatureDetections() != null)
            sb.append("SignatureDetections: ").append(getSignatureDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingDocument == false)
            return false;
        LendingDocument other = (LendingDocument) obj;
        if (other.getLendingFields() == null ^ this.getLendingFields() == null)
            return false;
        if (other.getLendingFields() != null && other.getLendingFields().equals(this.getLendingFields()) == false)
            return false;
        if (other.getSignatureDetections() == null ^ this.getSignatureDetections() == null)
            return false;
        if (other.getSignatureDetections() != null && other.getSignatureDetections().equals(this.getSignatureDetections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLendingFields() == null) ? 0 : getLendingFields().hashCode());
        hashCode = prime * hashCode + ((getSignatureDetections() == null) ? 0 : getSignatureDetections().hashCode());
        return hashCode;
    }

    @Override
    public LendingDocument clone() {
        try {
            return (LendingDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LendingDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
